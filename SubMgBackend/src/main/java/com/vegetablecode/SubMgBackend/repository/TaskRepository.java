package com.vegetablecode.SubMgBackend.repository;

import com.vegetablecode.SubMgBackend.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findByClientIdentifierOrderByPriority(String id);

    Task findByClientSequence(String sequence);

}
