package com.marda.aquarium.app.Application.port.out;

import com.marda.aquarium.app.Application.usecase.FindAllAquariumProductUseCase;
import com.marda.aquarium.app.Application.usecase.FindByIdAquariumProductUseCase;
import com.marda.aquarium.app.Application.usecase.RegisterAquariumProductUseCase;

//Repository
public interface AquariumProductPortOut extends RegisterAquariumProductUseCase, FindAllAquariumProductUseCase, FindByIdAquariumProductUseCase {

}
