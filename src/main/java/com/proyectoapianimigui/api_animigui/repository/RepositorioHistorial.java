package com.proyectoapianimigui.api_animigui.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoapianimigui.api_animigui.model.Historial;

public interface RepositorioHistorial extends JpaRepository <Historial, Long> {
    
}
