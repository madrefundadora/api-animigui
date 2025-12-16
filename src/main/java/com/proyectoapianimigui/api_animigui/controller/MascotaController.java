package com.proyectoapianimigui.api_animigui.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoapianimigui.api_animigui.model.Mascota;
import com.proyectoapianimigui.api_animigui.service.ServicioMascota;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    //INYECTAR EL SERVICIO
    private final ServicioMascota servicioMascota;

    public MascotaController(ServicioMascota servicioMascota) { //inyectar repositorio
        this.servicioMascota = servicioMascota; 

    }

    @GetMapping //gestina get 
    public List<Mascota> getAllMascotas() { //devuelve lista 
        return servicioMascota.getAllMascotas(); 
    }
    
}
