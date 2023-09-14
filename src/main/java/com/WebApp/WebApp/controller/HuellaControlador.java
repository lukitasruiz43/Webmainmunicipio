package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.PersonaDaoImp;
import com.WebApp.WebApp.dao.UsuarioDaoImp;
import com.WebApp.WebApp.models.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HuellaControlador {

    @Autowired  //Inyección de dependencias
    private PersonaDaoImp pers;


    // Para obtener lista total de usuarios
    @RequestMapping(value = "api/personas", method = RequestMethod.POST)
    public List<Personas> listaPersonas() {
        return pers.getLista();
    }


}


