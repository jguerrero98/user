package com.company.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value = "/saludo")
    public String saludo(@RequestParam(name = "name") String name, @RequestParam(name = "last_name") String lastName) {
        return "Hola " + name + " " + lastName;
    }


}
