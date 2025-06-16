package com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.repository;

import com.marda.aquarium.app.Domain.model.dto.AquariumProductDto;
import com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.entity.AquariumProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AquariumProductRepository extends JpaRepository<AquariumProduct, UUID> {
    // change return
    AquariumProduct save(AquariumProduct aquariumProduct);
}
