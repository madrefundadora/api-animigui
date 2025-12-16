package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.*;

@Entity
@Table(name = "veterinario")
public class Veterinario {

    public enum Especialidad {
        CLINICA_GENERAL,
        CIRUGIA,
        EXOTICOS
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vet")
    private Long idVet;

    private String nombre;
    private String apellido;

    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;


    private String numColegiado;

    private String horario;
}


