package com.marda.aquarium.app.Infrastructure.configuration;

import com.marda.aquarium.app.Application.port.in.AquariumProductPortIn;
import com.marda.aquarium.app.Application.port.out.AquariumProductPortOut;
import com.marda.aquarium.app.Application.service.AquariumService;
import com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.RegisterAquariumProductAdapter;
import com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.repository.AquariumProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public AquariumProductPortIn aquariumProductPortIn(AquariumProductPortOut aquariumProductPortOut) {
        return new AquariumService(aquariumProductPortOut);
    }

    // In case we do not want use Component in RegisterAquariumProductAdapter
//    @Bean
//    public AquariumProductPortOut aquariumProductPortOut(AquariumProductRepository aquariumProductRepository) {
//        return new RegisterAquariumProductAdapter(aquariumProductRepository);
//    }
}
