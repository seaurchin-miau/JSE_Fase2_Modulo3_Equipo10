package com.example.demo.controlador;

import com.example.demo.modelo.Cita;
import com.example.demo.negocio.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cita")
public class CitaController {

    private final CitaService service;

    @Autowired
    public CitaController(CitaService repository) {
        this.service = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void guardarCita(Cita cita){
        service.guardar(cita);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Cita buscarCita(Long id){
        return service.buscarPorId(id);
    }
}