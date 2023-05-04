package com.example.Ejemplo1.controller;

import com.example.Ejemplo1.entity.Empleado;
import com.example.Ejemplo1.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*Mismo controlador para el modelo "empleado" del archivo en  el Ejemplo3, pero añadiendo al controlador
las funciones findEmpleadoById y updateEmpleado para dejarlo completo */

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    private Flux<Empleado> getAllEmpleados(){
        return empleadoRepository.findAllEmpleados();
    }

    @GetMapping("/{id}")
    private Mono<Empleado> findEmpleadoById(@PathVariable String id){
        return empleadoRepository.findEmpleadoById(id);
    }

    @PostMapping("/update")
    private Mono<Empleado> updateEmpleado(@RequestBody Empleado empleado){
        return empleadoRepository.updateEmpleado(empleado);
    }
}
