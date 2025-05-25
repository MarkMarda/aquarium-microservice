package com.marda.aquarium.app.Domain.Entities;

import java.util.UUID;

public class Aquarium {
    private String _name;
    private String _aquariumType;
    private String _category;
    private double _price;
    private UUID id;

    public String get_name() {
        return _name;
    }

    public double get_price() {
        return _price;
    }

    public UUID getId() {
        return id;
    }

    public String get_aquariumType() {
        return _aquariumType;
    }

    public String get_category() {
        return _category;
    }
}
