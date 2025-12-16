package com.proyectoapianimigui.api_animigui.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.proyectoapianimigui.api_animigui.model.Cita;
import com.proyectoapianimigui.api_animigui.repository.RepositorioCita;

@Service
public class ServicioCita {

    private final RepositorioCita repoCita;

    public ServicioCita(RepositorioCita repoCita) { //inyectar repositorio
        this.repoCita = repoCita; 

    }

    public List<Cita> getAllCitas() { //devuelve lista de mascotas. 
        
        return repoCita.findAll(); 
        }   
}
