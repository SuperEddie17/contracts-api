package com.alesek.contracts_api.team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
   Optional<TeamEntity> findByName(String name);
   Optional<TeamEntity> findByUuid(UUID uuid);
}
