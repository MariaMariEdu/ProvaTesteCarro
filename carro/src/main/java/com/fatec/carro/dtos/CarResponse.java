package com.fatec.carro.dtos;

public record CarResponse(
   
    Long id,
    String make,
    Integer ano,
    String model,
    String color,
    String plate,
    Integer doors
) 

{}
