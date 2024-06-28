package com.cooweb.primerproyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.primerproyecto.dao.PersonaDao;
import com.cooweb.primerproyecto.models.Persona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PersonaController {
    @Autowired
    private PersonaDao personaDao;
    
    @RequestMapping(value="api/personas")
    public List<Persona> getPersonas(){
        return personaDao.obtenerPersona();
    }
    
    
    
}
