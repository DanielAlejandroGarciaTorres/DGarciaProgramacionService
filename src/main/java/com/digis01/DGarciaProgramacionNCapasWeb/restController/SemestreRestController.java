/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digis01.DGarciaProgramacionNCapasWeb.restController;

import com.digis01.DGarciaProgramacionNCapasWeb.DAO.SemestreDAOImplementation;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Semestre;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALIEN 34
 */
@RestController
@RequestMapping("/semestreapi")
public class SemestreRestController {
    
    private SemestreDAOImplementation semestreDAOImplementation;

    public SemestreRestController(SemestreDAOImplementation semestreDAOImplementation) {
        this.semestreDAOImplementation = semestreDAOImplementation;
    }
    
     @GetMapping("/GetAll")
    public List<Semestre> GetALL(){
        return semestreDAOImplementation.GetAll();
    }
    
    
}
