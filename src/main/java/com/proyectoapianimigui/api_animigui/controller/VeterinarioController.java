package com.proyectoapianimigui.api_animigui.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoapianimigui.api_animigui.model.Veterinario;
import com.proyectoapianimigui.api_animigui.service.ServicioVeterinario;

@RestController
@RequestMapping("/veterinario")
public class VeterinarioController {

    //INYECTAR EL SERVICIO
    private final ServicioVeterinario servicioVet;

    public VeterinarioController(ServicioVeterinario servicioVet) { //inyectar repositorio
        this.servicioVet = servicioVet; 

    }

    @GetMapping //gestina get 
    public List<Veterinario> getAllVeterinarios() { //devuelve lista 
        return servicioVet.getAllVeterinarios(); 
    }
    
}
