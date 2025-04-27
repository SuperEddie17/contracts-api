package com.alesek.contracts_api.teamMembership;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class TeamMembershipService {

    private final TeamMembershipRepository teamMembershipRepository;
    private final TeamMembershipMapper teamMembershipMapper;

    public TeamMembershipDto createMembership(CreationTeamMembershipDto creationTeamMembershipDto) {
        TeamMembershipEntity teamMembershipEntity = teamMembershipMapper.toEntity(creationTeamMembershipDto);
        TeamMembershipEntity savedEntity = teamMembershipRepository.save(teamMembershipEntity);
        return teamMembershipMapper.toDto(savedEntity);
    }
}
