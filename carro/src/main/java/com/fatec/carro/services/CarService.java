package com.fatec.carro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.carro.entities.Car;
import com.fatec.carro.repositories.CarRepository;


@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getCar(){
        return carRepository.findAll();
    }
}
