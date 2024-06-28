package com.cooweb.primerproyecto.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cooweb.primerproyecto.models.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonaDaoImp implements PersonaDao {

    @PersistenceContext
    private EntityManager entityManager;
    
    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<Persona> obtenerPersona(){
        String query="from Persona";
        
        List <Persona> resultado = entityManager.createQuery(query).getResultList();

        return resultado;
    }
}
