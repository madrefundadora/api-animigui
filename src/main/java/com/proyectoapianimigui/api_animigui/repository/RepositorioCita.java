package com.proyectoapianimigui.api_animigui.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoapianimigui.api_animigui.model.Cita;

public interface RepositorioCita extends JpaRepository <Cita, Long> {
    
}
