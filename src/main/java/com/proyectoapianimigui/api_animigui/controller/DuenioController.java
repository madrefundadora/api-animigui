package com.proyectoapianimigui.api_animigui.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoapianimigui.api_animigui.model.Duenio;
import com.proyectoapianimigui.api_animigui.service.ServicioDuenio;


@RestController
@RequestMapping("/duenio")
public class DuenioController {
     //INYECTAR EL SERVICIO
    private final ServicioDuenio servicioDuenio;

    public DuenioController(ServicioDuenio servicioDuenio) { //inyectar repositorio
        this.servicioDuenio = servicioDuenio; 

    }

    @GetMapping //gestina get 
    public List<Duenio> getAllDuenios() { //devuelve lista 
        return servicioDuenio.getAllDuenios(); 
    }
    
    
}
