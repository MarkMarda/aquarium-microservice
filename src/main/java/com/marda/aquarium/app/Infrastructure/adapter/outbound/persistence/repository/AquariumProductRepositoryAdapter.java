package com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.repository;

import com.marda.aquarium.app.Application.port.out.AquariumProductPortOut;
import com.marda.aquarium.app.Domain.model.dto.AquariumProductDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AquariumProductRepositoryAdapter implements AquariumProductPortOut {
    @Override
    public AquariumProductDto createAquariumProductUseCase() {
        return null;
    }

    @Override
    public List<AquariumProductDto> findAllAquariumProductUseCase() {
        return List.of();
    }

    @Override
    public void findByIdAquariumProductUseCase() {

    }
}
