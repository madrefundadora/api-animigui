package com.proyectoapianimigui.api_animigui.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoapianimigui.api_animigui.service.ServicioCompra;
import com.proyectoapianimigui.api_animigui.model.Compra;

@RestController
@RequestMapping("/compra")
public class CompraController {

     //INYECTAR EL SERVICIO
    private final ServicioCompra servicioCompra;

    public CompraController(ServicioCompra servicioCompra) { //inyectar repositorio
        this.servicioCompra = servicioCompra; 

    }

    @GetMapping //gestina get 
    public List<Compra> getAllCompras() { //devuelve lista 
        return servicioCompra.getAllCompras(); 
    }

}
