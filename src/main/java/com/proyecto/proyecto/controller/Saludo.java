package com.proyecto.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")

public class Saludo {
    @GetMapping("/hola")
    public String saludo() {
        return "buenos dias";
    }   
    @GetMapping("/hola2")
    public String saludo2() {
        return "como vas";
    }  
}
