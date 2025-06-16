package com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence;

import com.marda.aquarium.app.Application.port.out.AquariumProductPortOut;
import com.marda.aquarium.app.Domain.model.dto.AquariumProductDto;
import com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.repository.AquariumProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

//In this case I prefer use this because is on Infrastructure but we can use also a Bean in ApplicationConfig file
@Component
public class RegisterAquariumProductAdapter implements AquariumProductPortOut {
    private AquariumProductRepository aquariumProductRepository;

    public RegisterAquariumProductAdapter(AquariumProductRepository aquariumProductRepository) {
        this.aquariumProductRepository = aquariumProductRepository;
    }

    @Override
    public List<AquariumProductDto> findAllAquariumProductUseCase() {
        return List.of();
    }

    @Override
    public void findByIdAquariumProductUseCase() {

    }

    @Override
    public void registerAquariumProductUseCase(AquariumProductDto aquariumProductDto) {
        aquariumProductRepository.save(null);
    }
}
