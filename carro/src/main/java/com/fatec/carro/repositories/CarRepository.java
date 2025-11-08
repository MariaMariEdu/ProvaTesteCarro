package com.fatec.carro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.carro.entities.Car;

public interface CarRepository extends JpaRepository<Car,Long>{
    
}
