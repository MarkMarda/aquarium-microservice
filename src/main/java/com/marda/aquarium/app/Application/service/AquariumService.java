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
    public void createAquariumProductUseCase(AquariumProductDto aquariumProductDto) {
//        if (aquariumProductDto.getName() == aquariumProductDto.getName()) {
//            throw new RuntimeException("This product is still in the DB");
//        }

        aquariumProductPortOut.registerAquariumProductUseCase(aquariumProductDto);
    }

    @Override
    public void deleteAquariumProductUseCase() {

    }

    @Override
    public List<AquariumProductDto> findAllAquariumProductUseCase() {
        return List.of();
    }

    @Override
    public void findByIdAquariumProductUseCase() {

    }

    @Override
    public void updateAquariumProductUseCase() {

    }
}
