package com.proyectoapianimigui.api_animigui.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoapianimigui.api_animigui.model.Compra;

public interface RepositorioCompra extends JpaRepository <Compra, Long> {
    
}
