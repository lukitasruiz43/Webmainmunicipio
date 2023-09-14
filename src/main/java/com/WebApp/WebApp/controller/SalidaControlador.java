package com.WebApp.WebApp.controller;


import com.WebApp.WebApp.dao.UsuarioDaoImp;
import com.WebApp.WebApp.models.Personas;
import com.WebApp.WebApp.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SalidaControlador {

    @Autowired  //Inyección de dependencias
    private UsuarioSalidaImp salidas;


    // Para obtener lista total de usuarios
    @RequestMapping(value = "api/salidas", method = RequestMethod.GET)
    public List<Salida> listaSalidas() {
        return salidas.getLista();
    }

    @RequestMapping(value = "api/usuarios/del/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {
        user.eliminar(id);
    }


}

