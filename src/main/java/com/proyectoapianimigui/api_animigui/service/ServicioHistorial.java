package com.proyectoapianimigui.api_animigui.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.proyectoapianimigui.api_animigui.model.Historial;
import com.proyectoapianimigui.api_animigui.repository.RepositorioHistorial;

@Service
public class ServicioHistorial {
    
    private final RepositorioHistorial repoHistorial;

    public ServicioHistorial(RepositorioHistorial repoHistorial) { //inyectar repositorio
        this.repoHistorial = repoHistorial; 

    }

    public List<Historial> getAllHistorial() { //devuelve lista de mascotas. 
        
        return repoHistorial.findAll(); 
        }
    
}
