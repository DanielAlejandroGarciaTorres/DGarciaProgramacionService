/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digis01.DGarciaProgramacionNCapasWeb.restController;

import com.digis01.DGarciaProgramacionNCapasWeb.DAO.EstadoDAOImplementation;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Estado;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALIEN 34
 */
@RestController
@RequestMapping("/estadoapi")
public class EstadoRestController {

    private EstadoDAOImplementation estadoDAOImplementation;

    public EstadoRestController(EstadoDAOImplementation estadoDAOImplementation) {
        this.estadoDAOImplementation = estadoDAOImplementation;
    }

    @GetMapping("/GetEstadoByIdPais/{IdPais}")
    public List<Estado> GetEstadoByIdPais(@PathVariable int IdPais) {
        List<Estado> estados = estadoDAOImplementation.GetByIdPais(IdPais); // Obtiene los datos del servicio
        return estados;
    }

}
