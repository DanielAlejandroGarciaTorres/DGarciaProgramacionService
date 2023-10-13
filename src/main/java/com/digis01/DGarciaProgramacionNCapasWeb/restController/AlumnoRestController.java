/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digis01.DGarciaProgramacionNCapasWeb.restController;

import com.digis01.DGarciaProgramacionNCapasWeb.DAO.AlumnoDAOImplementation;
import com.digis01.DGarciaProgramacionNCapasWeb.DAO.DireccionDAOImplementation;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Alum;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.AlumnoDireccion;
import com.digis01.DGarciaProgramacionNCapasWeb.JPA.Direccion;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ALIEN 34
 */
@RestController
@RequestMapping("/alumnoapi")
public class AlumnoRestController {

    private AlumnoDAOImplementation alumnoDAOImplementation;
    private DireccionDAOImplementation direccionDAOImplementation;

    public AlumnoRestController(AlumnoDAOImplementation alumnoDAOImplementation,
            DireccionDAOImplementation direccionDAOImplementation) {
        this.alumnoDAOImplementation = alumnoDAOImplementation;
        this.direccionDAOImplementation = direccionDAOImplementation;
    }

    @GetMapping("/GetAll")
    public List<Alum> GetALL() {
        return alumnoDAOImplementation.GetAll(new Alum("", "", ""));
    }

    @PostMapping("/GetAll")
    public List<Alum> GetALL(@RequestBody Alum alumno) {
        return alumnoDAOImplementation.GetAll(alumno);
    }

    @PostMapping("/Save")
    public AlumnoDireccion Update(@RequestBody AlumnoDireccion alumnodireccion) {
        // actualización

//        
//        Semestre semestre = new Semestre();
//        semestre.setIdsemestre(2);
//        alumnodireccion.getAlumno().setSemestre(semestre);
//
        if (alumnodireccion.getAlumno().getIdalumno() > 0) { //UPDATE
            //alumnoDAOImplementation.Update(alumnodireccion.getAlumno());

            alumnoDAOImplementation.Update(alumnodireccion.getAlumno());

        } else {
            //alumnoDireccion.direccion.IdAlumno = 0; //Al idinsertado
            //NOTAAAAAAA: esto es por que no recuperamos información de dirección
            int idAlumno = alumnoDAOImplementation.Add(alumnodireccion.getAlumno()); //Regresar el IDINSERTADO
            alumnodireccion.getDireccion().setAlumno(new Alum(idAlumno));
            direccionDAOImplementation.Add(alumnodireccion.getDireccion());
        }

        return alumnodireccion;
    }

}
