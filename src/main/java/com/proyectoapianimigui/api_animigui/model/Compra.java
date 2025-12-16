package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "compra")
public class Compra {

    public enum Nombre{
        CONSULTA, VACUNA, DESPARACITACION, MEDICAMENTO
    }

    public enum Tipo{
        SERVICIO, PRODUCTO
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_compra")
    private Long id_compra;

    @Enumerated(EnumType.STRING)
    private Nombre nombre;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    private float precio;

    
}
