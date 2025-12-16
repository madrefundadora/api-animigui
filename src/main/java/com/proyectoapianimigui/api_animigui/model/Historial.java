package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.*;

@Entity
@Table(name = "historial")
public class Historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private Long idHistorial;

    private String tratamiento;
    private String diagnostico;
    private String observaciones;

    // un historial pertenece a una mascota
    @ManyToOne
    @JoinColumn(name = "id_mascota", nullable = false)
    private Mascota mascota;
}

