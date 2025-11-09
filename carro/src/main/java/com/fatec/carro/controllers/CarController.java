package com.fatec.carro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.carro.entities.Car;
import com.fatec.carro.services.CarService;
import java.util.List;

@RestController

@RequestMapping("car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping

    public ResponseEntity<List<Car>> getCar() {
        return ResponseEntity.ok(carService.getCar());
    }

}
