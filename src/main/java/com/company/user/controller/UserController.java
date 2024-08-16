package com.company.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/hola")
    public String hello() {
        return "Marin de marines";
    }

    @GetMapping(value = "/quetal")
    public String pregunta(){
        return "bien";
    }


}
