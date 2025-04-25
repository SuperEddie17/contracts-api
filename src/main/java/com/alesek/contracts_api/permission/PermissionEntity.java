package com.alesek.contracts_api.permission;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;
@Entity
public class PermissionEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID uuid;
    private Permission permission;


}
