package com.proyectoapianimigui.api_animigui.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoapianimigui.api_animigui.model.Cita;
import com.proyectoapianimigui.api_animigui.service.ServicioCita;

@RestController
@RequestMapping("/cita")
public class CitaController {

     //INYECTAR EL SERVICIO
    private final ServicioCita servicioCita;

    public CitaController(ServicioCita servicioCita) { //inyectar repositorio
        this.servicioCita = servicioCita; 

    }

    @GetMapping //gestina get 
    public List<Cita> getAllCitas() { //devuelve lista 
        return servicioCita.getAllCitas(); 
    }
    
}
