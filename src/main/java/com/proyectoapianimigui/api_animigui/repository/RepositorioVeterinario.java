package com.proyectoapianimigui.api_animigui.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoapianimigui.api_animigui.model.Veterinario;

public interface RepositorioVeterinario extends JpaRepository<Veterinario, Long> {
    
}
