package com.vegetablecode.SubMgBackend.service;

import com.vegetablecode.SubMgBackend.domain.Client;
import com.vegetablecode.SubMgBackend.exceptions.ClientIdException;
import com.vegetablecode.SubMgBackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveOrUpdateClient(Client client) {
        try{
            client.setClientIdentifier(client.getClientIdentifier().toUpperCase());
            return clientRepository.save(client);
        }catch (Exception e) {
            throw new ClientIdException("Client ID '" + client.getClientIdentifier().toUpperCase() + "' already exists!");
        }
    }

    public Client findClientByIdentifier(String clientId) {
        Client client = clientRepository.findByClientIdentifier(clientId.toUpperCase());
        if(client == null) {
            throw new ClientIdException("Client ID '" + clientId + "' does not exist!");
        }
        return client;
    }

    public Iterable<Client> findAllClients() {
        return clientRepository.findAll();
    }

    public void deleteClientByIdentifier(String clientId) {
        Client client = clientRepository.findByClientIdentifier(clientId);
        if(client == null) {
            throw new ClientIdException("Cannot delete Client with ID '" + clientId + "'. This Client does not exist!");
        }

        clientRepository.delete(client);
    }


}
