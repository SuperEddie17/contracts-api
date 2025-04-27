package com.alesek.contracts_api.teamMembership;

import lombok.Data;

@Data
public class CreationTeamMembershipDto {
    private String userUUID;
    private String teamUUID;
    private String permissionUUID;
    private String role;

}
