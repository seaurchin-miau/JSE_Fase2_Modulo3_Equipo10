package com.example.demo.negocio;

import com.example.demo.modelo.Cita;

public interface CitaService {

    void guardar(Cita cita);

    Cita buscarPorId(Long id);
}