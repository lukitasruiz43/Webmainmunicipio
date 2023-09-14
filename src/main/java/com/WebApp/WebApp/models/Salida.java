package com.WebApp.WebApp.models;

import jakarta.persistence.*;

public class Salida {


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
    @Column(name = "fecha")
    private String fecha;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_persona")
    private Personas persona;

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Column(name = "hora")
    private String hora;

}
