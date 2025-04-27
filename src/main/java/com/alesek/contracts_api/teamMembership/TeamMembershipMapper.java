package com.alesek.contracts_api.teamMembership;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper(componentModel = "spring")
public interface TeamMembershipMapper {

    TeamMembershipDto toDto(TeamMembershipEntity source);

    @Mapping(ignore = true, target = "joinDate")
    TeamMembershipEntity toEntity(CreationTeamMembershipDto source);
}
