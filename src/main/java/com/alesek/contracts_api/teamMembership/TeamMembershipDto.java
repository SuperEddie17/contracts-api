package com.alesek.contracts_api.teamMembership;

import lombok.Data;

@Data
public class TeamMembershipDto {
    private String userUUID;
    private String teamUUID;
    private String permissionUUID;
    private String joinDate;
    private String role;

}
