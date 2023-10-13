/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digis01.DGarciaProgramacionNCapasWeb.restController;

import com.digis01.DGarciaProgramacionNCapasWeb.DAO.PaisDAOImplementation;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Pais;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALIEN 34
 */
@RestController
@RequestMapping("/paisapi")
public class PaisRestController {
    
    private PaisDAOImplementation paisDAOImplementation;

    public PaisRestController(PaisDAOImplementation paisDAOImplementation) {
        this.paisDAOImplementation = paisDAOImplementation;
    }
    
    @GetMapping("/GetAll")
    public List<Pais> GetALL(){
        return paisDAOImplementation.GetAll();
    }
}
