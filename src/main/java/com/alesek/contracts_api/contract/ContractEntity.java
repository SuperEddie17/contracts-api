package com.alesek.contracts_api.contract;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.servlet.annotation.WebFilter;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity
public class ContractEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID contractUuid;

    private String contractNumber;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    @Transient
    private Set<UUID> teamUuids;
    
}
