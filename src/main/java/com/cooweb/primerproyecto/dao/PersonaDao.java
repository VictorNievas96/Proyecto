package com.cooweb.primerproyecto.dao;

import java.util.List;

import com.cooweb.primerproyecto.models.Persona;

import jakarta.transaction.Transactional;

@Transactional
public interface PersonaDao {
    List<Persona> obtenerPersona();
}
