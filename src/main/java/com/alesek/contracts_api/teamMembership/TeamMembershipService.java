package com.alesek.contracts_api.teamMembership;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

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

    public TeamMembershipDto getMembershipByUuid(UUID id) {
        TeamMembershipEntity teamMembershipEntity = teamMembershipRepository.findByUuid(id)
                .orElseThrow(() -> new RuntimeException("Team membership not found"));
        return teamMembershipMapper.toDto(teamMembershipEntity);
    }

    public void deleteMembership(UUID id) {
        teamMembershipRepository.delete(teamMembershipRepository.findByUuid(id)
                .orElseThrow(() -> new RuntimeException("Team membership not found")));
    }
}
