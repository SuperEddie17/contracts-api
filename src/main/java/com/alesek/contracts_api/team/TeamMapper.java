package com.alesek.contracts_api.team;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamDto toDTO(TeamEntity source);

    TeamEntity toEntity(TeamDto source);

    @Mapping(target = "id", ignore = true)
    void updateTeamEntity(TeamDto source, TeamEntity target);
}
