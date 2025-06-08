package com.marda.aquarium.app.Infrastructure.configuration;

import com.marda.aquarium.app.Application.port.in.AquariumProductPortIn;
import com.marda.aquarium.app.Application.port.out.AquariumProductPortOut;
import com.marda.aquarium.app.Application.service.AquariumService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public AquariumProductPortIn aquariumProductPortIn(AquariumProductPortOut aquariumProductPortOut) {
        return new AquariumService(aquariumProductPortOut);
    }
}
