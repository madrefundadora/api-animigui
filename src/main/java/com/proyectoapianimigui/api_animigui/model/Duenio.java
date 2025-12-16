
package com.proyectoapianimigui.api_animigui.model;

import jakarta.persistence.*;

@Entity
@Table(name = "duenio")
public class Duenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_duenio")
    private Long idDuenio;

    private String nombre;
    private String apellido;
    private Long telefono;
    private String correo;
    private String direccion;
}