package com.alesek.contracts_api.contractVersion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractVersionRepository extends JpaRepository<ContractVersionEntity, Long> {

}
