package com.vegetablecode.SubMgBackend.service;

import com.vegetablecode.SubMgBackend.domain.Agreement;
import com.vegetablecode.SubMgBackend.domain.Client;
import com.vegetablecode.SubMgBackend.domain.Task;
import com.vegetablecode.SubMgBackend.exceptions.ClientNotFoundException;
import com.vegetablecode.SubMgBackend.repository.AgreementRepository;
import com.vegetablecode.SubMgBackend.repository.ClientRepository;
import com.vegetablecode.SubMgBackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private AgreementRepository agreementRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ClientRepository clientRepository;

    public Task addTask(String clientIdentifier, Task task) {

        try {
            // task has to be added to a specific agreement, agreement != null -> client exists
            Agreement agreement = agreementRepository.findByClientIdentifier(clientIdentifier);

            // set agreement to task
            task.setAgreement(agreement);

            // i want our client sequence to be like this: IDCLI-1 IDCLI-2 ...100 101
            Integer agreementSequence = agreement.getTasksSequence();

            // update the agreement sequence
            agreementSequence++;
            agreement.setTasksSequence(agreementSequence);

            // add sequence to task
            task.setClientSequence(agreement.getClientIdentifier() + "-" + agreementSequence);
            task.setClientIdentifier(clientIdentifier);

            // INITIAL priority when priority null
            if(task.getPriority() == null) {
                task.setPriority(3);
            }

            return taskRepository.save(task);
        } catch (Exception e) {
            throw new ClientNotFoundException("Client not Found!");
        }
    }

    public Iterable<Task> findBacklogById(String id) {
        Client client = clientRepository.findByClientIdentifier(id);
        if(client == null) {
            throw new ClientNotFoundException("Client with ID: '" + id + "' does not exist!");
        }
        return taskRepository.findByClientIdentifierOrderByPriority(id);
    }
}