package com.proyectoapianimigui.api_animigui.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoapianimigui.api_animigui.model.Historial;
import com.proyectoapianimigui.api_animigui.service.ServicioHistorial;


@RestController
@RequestMapping("/historial")
public class HistorialController {

    //INYECTAR EL SERVICIO
    private final ServicioHistorial servicioHistorial;

    public HistorialController(ServicioHistorial servicioHistorial) { //inyectar repositorio
        this.servicioHistorial = servicioHistorial; 

    }

    @GetMapping //gestina get 
    public List<Historial> getAllHistorial() { //devuelve lista 
        return servicioHistorial.getAllHistorial(); 
    }
}
