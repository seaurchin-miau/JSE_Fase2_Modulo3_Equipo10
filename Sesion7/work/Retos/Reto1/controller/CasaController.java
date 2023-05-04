package com.example.Ejemplo1.controller;


import com.example.Ejemplo1.entity.Auto;
import com.example.Ejemplo1.entity.Casa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/autos")
public class AutoController {

    @PostMapping("/casa")
    public void recibeCasa(@RequestBody Casa casa1){
        log.info(casa1.toString());
    }
}
