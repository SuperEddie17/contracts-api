package com.alesek.contracts_api.contractVersion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
public class ContractVersionEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID contractVersionUuid;

    private String versionNumber;

    private LocalDateTime createdAt;

    private String documentUrl;

    private UUID createdByUserUuid;

    private UUID contractUuid;

}
