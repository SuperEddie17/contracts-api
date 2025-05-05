package com.alesek.contracts_api.teamMembership;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TeamMembershipRepository extends JpaRepository<TeamMembershipEntity, Long> {

    Optional<TeamMembershipEntity> findByUuid(UUID uuid);

}
