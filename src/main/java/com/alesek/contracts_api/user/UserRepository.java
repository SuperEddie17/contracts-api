package com.alesek.contracts_api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Custom query methods can be defined here if needed
    // For example:
    // List<UserEntity> findByUsername(String username);
}
