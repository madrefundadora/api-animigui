package com.proyectoapianimigui.api_animigui.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long idMascota;

    private String nombre;
    private String especie;
    private String raza;

    @Column(name = "fecha_nac")
    private LocalDate fechaNac;

    private float peso;

    @ManyToOne
    @JoinColumn(name = "id_duenio", nullable = false)
    private Duenio duenio;
}

