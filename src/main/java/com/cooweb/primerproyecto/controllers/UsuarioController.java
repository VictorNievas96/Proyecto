package com.cooweb.primerproyecto.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value="api/usuarios/{id}", method=RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }
    @RequestMapping(value="api/usuarios", method=RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }
}


