package com.proyectoapianimigui.api_animigui.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_mascota")
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private Date fechaNac;
    private float peso;

  //clave foranea 
    @ManyToOne //un dueño tiene muchos animales y un animal tiene un solo dueño, la clave esta al final, ManyToOne clave es one, una mascota tiene un cliente 
    @JoinColumn(name = "id_duenio")
    private Duenio duenio;


    
    
}
