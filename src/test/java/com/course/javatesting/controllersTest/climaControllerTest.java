package com.course.javatesting.controllersTest;

import com.course.javatesting.controllers.climaController;
import com.course.javatesting.models.Clima;
import com.course.javatesting.services.ClimaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
public class climaControllerTest {

    @InjectMocks
    private climaController controller;

    @Mock
    private ClimaService service;

    @Test
    public void getClima(){

        //Creamos el objeto DE LA clase clima
        Clima climaMock= new Clima();

        //llamamos a sus metodos setters
        climaMock.setMinTemp(30);
        climaMock.setMaxTemp(15);
        climaMock.setEstado("Soleado");
        //Cuando se llame al metodo get clima va a devolver un objeto de la clase Clima
        when(service.getClima())
                                .thenReturn(climaMock);
        
        Clima resultado=  controller.getClima();
                            //Verificamso que llamamos almenos una vez al servicio
        verify(service,times(1)).getClima();
    }
}
