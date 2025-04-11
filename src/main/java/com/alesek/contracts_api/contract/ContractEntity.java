package com.alesek.contracts_api.contract;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public class ContractEntity {

    private UUID contractUuid;

    private String contractNumber;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    Set<UUID> teamUuids;
    
}
