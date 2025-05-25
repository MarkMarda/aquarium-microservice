package com.marda.aquarium.app.Domain.model;

import java.util.UUID;

public class Aquarium {
    private UUID id;
    private String _name;
    private String _aquariumType;
    private String _category;
    private double _price;

    public UUID getId() {
        return id;
    }

    public String get_name() {
        return _name;
    }

    public String get_aquariumType() {
        return _aquariumType;
    }

    public String get_category() {
        return _category;
    }

    public double get_price() {
        return _price;
    }
}
