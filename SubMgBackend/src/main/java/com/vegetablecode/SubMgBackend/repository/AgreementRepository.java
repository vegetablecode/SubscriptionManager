package com.vegetablecode.SubMgBackend.repository;

import com.vegetablecode.SubMgBackend.domain.Agreement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementRepository extends CrudRepository<Agreement, Long> {

    Agreement findByClientIdentifier(String identifier);

}
