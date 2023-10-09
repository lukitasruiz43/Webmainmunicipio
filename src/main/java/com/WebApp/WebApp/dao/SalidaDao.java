package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Salida;
import com.WebApp.WebApp.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface SalidaDao {


    List<Salida> getLista();

    void eliminar(int id);

    void registrar(Map<String, String> u);
}
