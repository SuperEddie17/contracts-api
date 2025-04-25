package com.alesek.contracts_api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUuid(UUID userUuid);
    UserEntity findByEmail(String email);
    UserEntity findByFirstNameAndLastName(String firstName, String lastName);
}
