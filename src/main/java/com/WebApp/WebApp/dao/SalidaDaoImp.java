package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Salida;
import com.WebApp.WebApp.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class SalidaDaoImp{
    @PersistenceContext
    private EntityManager entityManager;

    public List<Salida> getLista() {
        String query = "FROM Salida";  // OJO!!! Acá va la CLASE del modelo, NO la tabla
        return entityManager.createQuery(query).getResultList();
    }

    public void eliminar(int id) {
        Salida sal = entityManager.find(Salida.class, id);
        entityManager.remove(sal);
    }



}
