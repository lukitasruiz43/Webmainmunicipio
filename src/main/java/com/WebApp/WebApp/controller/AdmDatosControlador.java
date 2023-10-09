package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.SalidaDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AdmDatosControlador {

    @Autowired  //Inyección de dependencias
    private SalidaDaoImp pers;

    @RequestMapping(value = "api/huella/eliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {
        pers.eliminar(id);
    }









}

