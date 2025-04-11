package com.alesek.contracts_api.permission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<PermissionEntity, Long> {
    // Custom query methods can be defined here if needed
    // For example:
    // List<PermissionEntity> findByName(String name);
}
