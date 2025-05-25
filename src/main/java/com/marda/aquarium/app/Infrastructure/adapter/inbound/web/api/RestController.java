package com.marda.aquarium.app.Infrastructure.adapter.inbound.web.api;

import com.marda.aquarium.app.Application.port.in.AquariumProductPortIn;
import lombok.RequiredArgsConstructor;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {
    private AquariumProductPortIn aquariumProductPortIn;
}
