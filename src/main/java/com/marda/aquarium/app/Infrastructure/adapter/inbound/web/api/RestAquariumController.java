package com.marda.aquarium.app.Infrastructure.adapter.inbound.web.api;

import com.marda.aquarium.app.Application.port.in.AquariumProductPortIn;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/aquarium")
//@RequiredArgsConstructor
public class RestAquariumController {
    private final AquariumProductPortIn aquariumProductPortIn;

    public RestAquariumController(AquariumProductPortIn aquariumProductPortIn) {
        this.aquariumProductPortIn = aquariumProductPortIn;
    }

    @GetMapping
    public List<?> getAllAquariumProducts() {
        return aquariumProductPortIn.findAllAquariumProductUseCase();
    }
}
