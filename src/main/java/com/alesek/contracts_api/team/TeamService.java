package com.alesek.contracts_api.team;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public TeamDto createTeam(TeamDto teamDto){
        TeamEntity teamEntity = teamMapper.toEntity(teamDto);
        teamRepository.saveAndFlush(teamEntity);
        return teamMapper.toDTO(teamEntity);
    }

    public TeamDto editTeam(TeamDto teamDto, UUID teamUuid){
        TeamEntity teamEntity = teamRepository.findByUuid(teamUuid)
                .orElseThrow(() -> new RuntimeException("Team not found"));
        teamMapper.updateTeamEntity(teamDto, teamEntity);
        teamRepository.saveAndFlush(teamEntity);
        return teamMapper.toDTO(teamEntity);
    }
    public void deleteTeam(UUID teamUuid){
        TeamEntity teamEntity = teamRepository.findByUuid(teamUuid)
                .orElseThrow(() -> new RuntimeException("Team not found"));
        teamRepository.delete(teamEntity);
    }

}
