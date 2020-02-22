/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.invierno;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/api")
public class ControladorAlumno
{

    @Autowired AlumnoRepositorio AlumRep;
    
    // ESTE METODO BUSCA A TODOS LOS ALUMNOS GUARDADOS
    
    @GetMapping ("/Alumno")
    public List <Alumno> buscarTodos()throws Exception
    {
    
        return AlumRep.findAll();
        
    }
    
    //mETODO NUEVO ALUMNO
    
    @PostMapping("/Alumno")
    public Estatus guardarAlumno(@RequestBody String json) throws Exception
    {
    
        //Primero el cuerpo que llega lo desserializar
        
        ObjectMapper maper=new ObjectMapper();
        
        //Mapear es convertir
        
        Alumno a=maper.readValue(json, Alumno.class);
     
        AlumRep.save(a);
        
        Estatus e=new Estatus();
        e.setMensaje(json);
        e.setSuccess(true);
        return e;
        
    }
    
}
