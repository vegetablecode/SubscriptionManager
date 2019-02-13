package com.vegetablecode.SubMgBackend.service;

import com.vegetablecode.SubMgBackend.domain.Client;
import com.vegetablecode.SubMgBackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveOrUpdateClient(Client client) {
        if(client.getNip()==null || client.getNip() == "") {
            client.setNip("nie podano");
        }
        return clientRepository.save(client);
    }

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client findById(Long id) {
        return clientRepository.getById(id);
    }

    public void delete(Long id) {
        Client client = findById(id);
        clientRepository.delete(client);
    }

}
