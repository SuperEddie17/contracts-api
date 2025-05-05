package com.alesek.contracts_api.teamMembership;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/teamMembership")
public class TeamMembershipController {

    private final TeamMembershipService teamMembershipService;

    @PostMapping("")
    public TeamMembershipDto createMembership(@RequestBody CreationTeamMembershipDto creationTeamMembershipDto) {
        return teamMembershipService.createMembership(creationTeamMembershipDto);
    }
    @GetMapping("/{uuid}")
    public TeamMembershipDto getMembershipByUuid(@PathVariable UUID uuid) {
        return teamMembershipService.getMembershipByUuid(uuid);
    }
    @DeleteMapping("/{uuid}")
    public void deleteMembership(@PathVariable UUID uuid) {
        teamMembershipService.deleteMembership(uuid);
    }
}
