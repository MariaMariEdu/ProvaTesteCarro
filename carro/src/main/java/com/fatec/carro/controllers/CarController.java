package com.fatec.carro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.carro.entities.Car;
import com.fatec.carro.repositories.CarRepository;
import com.fatec.carro.services.CarService;

import jakarta.persistence.EntityNotFoundException;





@RestController



@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/{id}")

    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
      
        return ResponseEntity.ok(carService.getCarById(id));
    }

    @Autowired
    private CarRepository carRepository;


    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        if (carRepository.existsById(id)){
            carRepository.deleteById(id);
        }

        else{
            throw new EntityNotFoundException("Carro com ID " + id + " não encontrado");
        }
    }

    

}
