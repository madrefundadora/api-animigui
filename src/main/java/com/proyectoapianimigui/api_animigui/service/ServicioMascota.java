package com.proyectoapianimigui.api_animigui.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.proyectoapianimigui.api_animigui.model.Mascota;
import com.proyectoapianimigui.api_animigui.repository.RepositorioMascota;

@Service //anotar con service 
public class ServicioMascota {

    private final RepositorioMascota repoMascota;

    public ServicioMascota(RepositorioMascota repoMascota) { //inyectar repositorio
        this.repoMascota = repoMascota; 

    }

    public List<Mascota> getAllMascotas() { //devuelve lista de mascotas. 
        
        return repoMascota.findAll(); 
        }
    
}
