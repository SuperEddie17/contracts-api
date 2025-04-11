package com.alesek.contracts_api.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
    // Custom query methods can be defined here if needed
    // For example:
    // List<TeamEntity> findByName(String name);
}
