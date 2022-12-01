package com.course.javatesting.models;


import lombok.*;

@ToString
@Getter @Setter @EqualsAndHashCode
public class Clima {

    private String estado;
    private Integer minTemp;
    private Integer maxTemp;

}
