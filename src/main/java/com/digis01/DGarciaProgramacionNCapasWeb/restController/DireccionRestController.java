/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digis01.DGarciaProgramacionNCapasWeb.restController;

import com.digis01.DGarciaProgramacionNCapasWeb.DAO.DireccionDAOImplementation;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Alum;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Direccion;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ALIEN 34
 */

public class DireccionRestController {
    
    private DireccionDAOImplementation direccionDAOImplementation;

    public DireccionRestController(DireccionDAOImplementation direccionDAOImplementation) {
        this.direccionDAOImplementation = direccionDAOImplementation;
    }
    
     @GetMapping("/GetAll")
    public List<Direccion> GetALL(){
        return direccionDAOImplementation.GetAll();
    }
    
}
