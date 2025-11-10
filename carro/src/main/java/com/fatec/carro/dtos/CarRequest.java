package com.fatec.carro.dtos;

public record CarRequest(
    String make,
    Integer ano,
    String model,
    String color,
    String plate,
    Integer doors
) {}
