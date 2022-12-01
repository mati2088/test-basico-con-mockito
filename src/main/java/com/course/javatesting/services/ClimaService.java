package com.course.javatesting.services;

import com.course.javatesting.models.Clima;
import org.springframework.stereotype.Service;

@Service
public class ClimaService {
    public Clima getClima(){
        Clima clima= new Clima();
        clima.setMaxTemp(10);
        clima.setMinTemp(8);
        clima.setEstado("Nublado");
        return clima;
    }
}
