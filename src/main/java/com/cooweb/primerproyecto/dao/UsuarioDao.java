package com.cooweb.primerproyecto.dao;

import java.util.List;

import com.cooweb.primerproyecto.models.Usuario;

import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao{
    List<Usuario> getUsuarios();
}