package com.alesek.contracts_api.team;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class TeamEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID uuid;
    private String name;
    private String description;

}
