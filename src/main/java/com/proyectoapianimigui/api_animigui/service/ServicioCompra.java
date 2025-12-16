package com.proyectoapianimigui.api_animigui.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.proyectoapianimigui.api_animigui.model.Compra;
import com.proyectoapianimigui.api_animigui.repository.RepositorioCompra;

@Service
public class ServicioCompra {
    private final RepositorioCompra repoCompra;

    public ServicioCompra(RepositorioCompra repoCompra) { //inyectar repositorio
        this.repoCompra = repoCompra; 

    }

    public List<Compra> getAllCompras() { //devuelve lista de mascotas. 
        
        return repoCompra.findAll(); 
        }
    
}
