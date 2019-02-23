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
import org.springframework.web.bind.annotation.DeleteMapping;

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

    public Task findTaskByClientSequence(String agreement_id, String task_id) {
        // make sure we are searching on an existing agreement
        Agreement agreement = agreementRepository.findByClientIdentifier(agreement_id);
        if(agreement == null) {
            throw new ClientNotFoundException("Client with ID: '" + agreement_id + "' does not exist!");
        }

        // make sure that the task exists
        Task task = taskRepository.findByClientSequence(task_id);
        if(task == null) {
            throw new ClientNotFoundException("Client Task: '" + task_id + "' not found!");
        }

        // make sure that the agreement/project in the path corresponds to the right client
        if(!task.getClientIdentifier().equals(agreement_id)) {
            throw new ClientNotFoundException("Client Task: '" + task_id + "' does not exist in Client: '" + agreement_id);
        }

        return task;
    }

    public Task updateByClientSequence(Task updatedTask, String agreement_id, String task_id) {
        Task task = findTaskByClientSequence(agreement_id, task_id);
        task = updatedTask;
        return taskRepository.save(task);
    }

    public void deleteTaskByClientSequence(String agreement_id, String task_id) {
        Task task = findTaskByClientSequence(agreement_id, task_id);
        taskRepository.delete(task);
    }
}