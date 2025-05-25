package com.marda.aquarium.app.Application.port.out;

import com.marda.aquarium.app.Domain.model.Aquarium;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract class AquariumPersistencePort {
    abstract Aquarium save(Aquarium product);
    abstract Optional<Aquarium> findById(UUID id);
    abstract List<Aquarium> findAll();
    abstract void deleteById(UUID id);
}
