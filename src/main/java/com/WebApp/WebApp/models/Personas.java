package com.WebApp.WebApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Personas")
public class Personas {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dni")
    private String dni;
    @Column(name = "curso")
    private String curso;
    @Column(name = "turno")
    private String turno;
    @Column(name = "huella")
    private String huella;


}
