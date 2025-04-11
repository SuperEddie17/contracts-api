package com.alesek.contracts_api.contractVersion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class ContractVersionEntity {

    private UUID contractVersionUuid;

    private String versionNumber;

    private LocalDateTime createdAt;

    private String documentUrl;

    private UUID createdByUserUuid;

    private UUID contractUuid;

}
