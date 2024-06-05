package com.knnovais.aula_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    String exibirMensagem(){
        return "Welcome to my channel";
    }
}
