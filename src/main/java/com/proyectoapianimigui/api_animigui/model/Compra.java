package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.*;

@Entity
@Table(name = "compra")
public class Compra {

    public enum Nombre {
        CONSULTA,
        VACUNA,
        DESPARACITACION,
        MEDICAMENTO
    }

    public enum Tipo {
        SERVICIO,
        PRODUCTO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long idCompra;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Nombre nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Tipo tipo;

    private float precio;
}

