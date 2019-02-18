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
        return clientRepository.save(client);
    }

}
