package com.alesek.contracts_api.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<ContractEntity, Long> {
    // Custom query methods can be defined here if needed
    // For example:
    // List<ContractEntity> findByStatus(String status);
}
