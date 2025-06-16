package com.marda.aquarium.app.Domain.model.dto;

import java.util.UUID;

public class AquariumProductDto {
    private UUID id;
    private String name;
    private String aquariumType;
    private String category;
    private double price;

    AquariumProductDto(UUID id, String name, String aquariumType, String category, double price) {
        this.id = id;
        this.name = name;
        this.aquariumType = aquariumType;
        this.category = category;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAquariumType() {
        return aquariumType;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

}
