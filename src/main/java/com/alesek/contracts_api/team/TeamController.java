package com.alesek.contracts_api.team;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/teams")
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @PostMapping("")
    public TeamDto createTeam(@RequestBody TeamDto teamDto){
        return teamService.createTeam(teamDto);
    }

    @PatchMapping("/{teamUuid}")
    public TeamDto editTeam(@RequestBody TeamDto teamDto,@PathVariable UUID teamUuid){
        return teamService.editTeam(teamDto, teamUuid);
    }
    @DeleteMapping("/{teamUuid}")
    public void deleteTeam(@PathVariable UUID teamUuid){
        teamService.deleteTeam(teamUuid);
    }
}
