package com.WebApp.WebApp.controller;


import com.WebApp.WebApp.dao.SalidaDaoImp;
import com.WebApp.WebApp.dao.UsuarioDaoImp;
import com.WebApp.WebApp.models.Personas;
import com.WebApp.WebApp.models.Salida;
import com.WebApp.WebApp.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SalidaControlador {

    @Autowired  //Inyección de dependencias
    private SalidaDaoImp salida;


    // Para obtener lista total de usuarios
    @RequestMapping(value = "api/salida", method = RequestMethod.GET)
    public List<Salida> listaSalida() {
        return salida.getLista();
    }

    @RequestMapping(value = "api/salida/eliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {
        salida.eliminar(id);
    }




}

