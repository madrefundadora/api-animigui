package com.proyectoapianimigui.api_animigui.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.proyectoapianimigui.api_animigui.model.Veterinario;
import com.proyectoapianimigui.api_animigui.repository.RepositorioVeterinario;

@Service
public class ServicioVeterinario {
    private final RepositorioVeterinario repoVeterinario;

    public ServicioVeterinario(RepositorioVeterinario repoVeterinario) { //inyectar repositorio
        this.repoVeterinario = repoVeterinario; 

    }
    public List<Veterinario> getAllVeterinarios() { //devuelve lista de mascotas. 
        
        return repoVeterinario.findAll(); 
        }
    
}
