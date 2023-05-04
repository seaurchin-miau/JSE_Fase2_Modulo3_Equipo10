package com.example.Ejemplo1.controller;

import com.example.Ejemplo1.entity.Empleado;
import com.example.Ejemplo1.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    private Flux<Empleado> getAllEmpleados(){
        return empleadoRepository.findAllEmpleados();
    }


}
