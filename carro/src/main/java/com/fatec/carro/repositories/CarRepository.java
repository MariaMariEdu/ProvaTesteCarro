package com.fatec.carro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.carro.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>{
    
}