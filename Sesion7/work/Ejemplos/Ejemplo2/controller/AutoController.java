package com.example.Ejemplo1.controller;


import com.example.Ejemplo1.entity.Auto;
import com.example.Ejemplo1.entity.Casa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/autos")
public class AutoController {

    @GetMapping("/saludo")
    public String saluda(){
        return "Hola Autos";
    }

    @PostMapping("/auto")
    public void recibe(@RequestBody Auto auto){
        log.info(auto.toString());
    }

}
