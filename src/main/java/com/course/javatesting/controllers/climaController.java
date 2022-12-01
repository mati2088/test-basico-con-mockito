package com.course.javatesting.controllers;

import com.course.javatesting.models.Clima;
import com.course.javatesting.services.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class climaController {

    @Autowired
    private ClimaService service;


    @GetMapping("/api/clima")
    public Clima getClima(){

        return service.getClima();}

}
