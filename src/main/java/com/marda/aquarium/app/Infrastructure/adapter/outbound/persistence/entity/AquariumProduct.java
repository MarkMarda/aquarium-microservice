package com.marda.aquarium.app.Infrastructure.adapter.outbound.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "aquariumProducts")
public class AquariumProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


}
