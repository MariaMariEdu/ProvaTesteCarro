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
    private Integer ano;
    private String model;
    private String color;
    private String plate;
    private Integer doors;


    public Car() {}

    public Car(Long id, String make, Integer ano, String model, String color, String plate, Integer doors) {
        this.id = id;
        this.make = make;
        this.ano = ano;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.doors = doors;

        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    


     

    
}
