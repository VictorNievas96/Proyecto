package com.cooweb.primerproyecto.dao;

import java.util.List;

import com.cooweb.primerproyecto.models.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao{

    List<Usuario> getUsuarios();
    void eliminar(Long id);
    void registrar(Usuario usuario);
    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);

}