package com.vegetablecode.SubMgBackend.repository;

import com.vegetablecode.SubMgBackend.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    @Override
    Iterable<Client> findAllById(Iterable<Long> iterable);

}
