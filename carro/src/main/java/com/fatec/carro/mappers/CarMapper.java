package com.fatec.carro.mappers;

import com.fatec.carro.dtos.CarRequest;
import com.fatec.carro.dtos.CarResponse;
import com.fatec.carro.entities.Car;


public class CarMapper {

    public static Car toEntity(CarRequest request) {
        Car car = new Car(); 

        car.setMake(request.make());
        car.setAno(request.ano());
        car.setModel(request.model());
        car.setColor(request.color());
        car.setPlate(request.plate());
        car.setDoors(request.doors());

    return car; 
    }
    

 public static CarResponse toDto(Car entity) {
        return new CarResponse(
            entity.getId(),
            entity.getMake(),
            entity.getAno(),
            entity.getModel(),
            entity.getColor(),
            entity.getPlate(),
            entity.getDoors()
        );
 }
}
