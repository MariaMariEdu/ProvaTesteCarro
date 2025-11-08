package com.fatec.carro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity

@Table(name= "TBL_CAR")
public class Car {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String make;
    private Integer year;
    private String model;
    private String color;
    private String plate;
    private String doors;
    public Car(Long id, String make, Integer year, String model, String color, String plate, String doors) {
        this.id = id;
        this.make = make;
        this.year = year;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.doors = doors;
    }
    
    

    
}
