package com.alesek.contracts_api.teamMembership;


import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public class TeamMembershipEntity {

    private UUID uuid;

    private UUID userUUID;
    private UUID teamUUID;
    private Set<UUID> permissionUUIDs;
    private LocalDate joinDate;
    private String role;
}
