package com.marda.aquarium.app.Application.usecase;

import com.marda.aquarium.app.Domain.model.dto.AquariumProductDto;

import java.util.List;

public interface FindAllAquariumProductUseCase {
    List<AquariumProductDto> findAllAquariumProductUseCase();
}
