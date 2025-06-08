package com.marda.aquarium.app.Application.port.out;

import com.marda.aquarium.app.Application.usecase.CreateAquariumProductUseCase;
import com.marda.aquarium.app.Application.usecase.FindAllAquariumProductUseCase;
import com.marda.aquarium.app.Application.usecase.FindByIdAquariumProductUseCase;

//Repository
public interface AquariumProductPortOut extends CreateAquariumProductUseCase, FindAllAquariumProductUseCase, FindByIdAquariumProductUseCase {

}
