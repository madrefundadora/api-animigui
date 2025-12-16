package com.proyectoapianimigui.api_animigui.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cita")
public class Cita {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_cita")
    private Long id_cita;

    private Date fecha_cita;
    private Date hora; //mirar bien si date es la mejor opcion

    public enum Estado {
    PENDIENTE, 
    CONFIRMADA,
    CANCELADA
    }

    @Enumerated(EnumType.STRING)
    private Estado estado;

    //ahora con las foraneas las dos son manytoone, porque solo un cliente x cita y solo una mascota 
    @ManyToOne
    @JoinColumn(name = "id_duenio")
    private Duenio id_duenio;

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinario id_veterinario;


    
}
