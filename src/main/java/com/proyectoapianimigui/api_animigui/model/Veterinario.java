package com.proyectoapianimigui.api_animigui.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name="veterinario")
public class Veterinario {

    public enum Especialidad {
    CLINICA_GENERAL, 
    CIRUGIA,
    EXOTICOS
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_vet")
    private Long id_vet;
    private String nombre;
    private String apellido;
    private Long numColegiado;
    private String horario;


    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
  
}
