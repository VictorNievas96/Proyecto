package com.cooweb.primerproyecto.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.primerproyecto.dao.UsuarioDao;
import com.cooweb.primerproyecto.models.Usuario;



@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value="api/usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> user = usuarioDao.getUsuarios();
        return user;
    }
}


