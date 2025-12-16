package com.proyectoapianimigui.api_animigui.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.proyectoapianimigui.api_animigui.model.Duenio;
import com.proyectoapianimigui.api_animigui.repository.RepositorioDuenio;

@Service
public class ServicioDuenio {
    private final RepositorioDuenio repoDuenio;

    public ServicioDuenio(RepositorioDuenio repoDuenio) { //inyectar repositorio
        this.repoDuenio = repoDuenio; 

    }

    public List<Duenio> getAllDuenios() { //devuelve lista de mascotas. 
        
        return repoDuenio.findAll(); 
        }
    
}
