package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "duenio")
public class Duenio {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_duenio")
    private Long id_duenio;
    private String nombre;
    private String apellido;
    private Long telefono;
    private String correo;
    private String email;


}
