package com.alesek.contracts_api.teamMembership;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity(name = "team_membership")
@Setter
public class TeamMembershipEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID uuid;
    private UUID userUUID;
    private UUID teamUUID;
    private UUID permissionUUID;
    @CreationTimestamp
    private LocalDateTime joinDate;
    private String role;
}
