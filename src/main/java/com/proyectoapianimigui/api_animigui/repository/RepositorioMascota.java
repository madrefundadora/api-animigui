package com.proyectoapianimigui.api_animigui.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoapianimigui.api_animigui.model.Mascota;

public interface RepositorioMascota extends JpaRepository<Mascota, Long> {
    
}
