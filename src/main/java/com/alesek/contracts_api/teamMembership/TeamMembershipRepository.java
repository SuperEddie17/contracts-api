package com.alesek.contracts_api.teamMembership;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMembershipRepository extends JpaRepository<TeamMembershipEntity, Long> {
    // Custom query methods can be defined here if needed
    // For example:
    // List<TeamMembershipEntity> findByStatus(String status);
}
