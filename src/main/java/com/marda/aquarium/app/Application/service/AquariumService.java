package com.marda.aquarium.app.Application.service;

import com.marda.aquarium.app.Application.port.in.AquariumProductPortIn;
import com.marda.aquarium.app.Application.port.out.AquariumProductPortOut;
import com.marda.aquarium.app.Domain.model.dto.AquariumProductDto;

import java.util.List;

public class AquariumService implements AquariumProductPortIn {
    private final AquariumProductPortOut aquariumProductPortOut;

    public AquariumService(AquariumProductPortOut aquariumProductPortOut) {
        this.aquariumProductPortOut = aquariumProductPortOut;
    }

    @Override
    public AquariumProductDto createAquariumProductUseCase() {

        return null;
    }

    @Override
    public void deleteAquariumProductUseCase() {

    }

    @Override
    public List<AquariumProductDto> findAllAquariumProductUseCase() {

        return null;
    }

    @Override
    public void findByIdAquariumProductUseCase() {

    }

    @Override
    public void updateAquariumProductUseCase() {

    }
}
