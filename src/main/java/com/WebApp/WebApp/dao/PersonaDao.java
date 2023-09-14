package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Personas;
import com.WebApp.WebApp.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface PersonaDao {


    List<Personas> getLista();

}
