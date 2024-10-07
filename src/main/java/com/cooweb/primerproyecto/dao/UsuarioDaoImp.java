package com.cooweb.primerproyecto.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.cooweb.primerproyecto.models.Usuario;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
    

    @PersistenceContext
    private EntityManager entityManager;


        @SuppressWarnings("unchecked")
        @Override
        @Transactional 
        public List<Usuario> getUsuarios(){
            String query="FROM Usuario";
            List<Usuario> resultado = entityManager.createQuery(query).getResultList();

            return resultado;   
        }
        @Override
        
        public void eliminar(Long id){
            Usuario usuario=entityManager.find(Usuario.class, id);
            entityManager.remove(usuario);
        }

        @Override
        public void registrar(Usuario usuario){
            entityManager.merge(usuario);
        }
}