package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "historial")
public class Historial {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_historial")
    private Long id_historial;
    private String tratamiento;
    private String diagnostico;
    private String observaciones;

    //un historial tiene una mascota 
    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Mascota id_mascota;

    
}
