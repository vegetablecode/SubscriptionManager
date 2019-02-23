package com.vegetablecode.SubMgBackend.web;


import com.vegetablecode.SubMgBackend.domain.Agreement;
import com.vegetablecode.SubMgBackend.domain.Client;
import com.vegetablecode.SubMgBackend.service.ClientService;
import com.vegetablecode.SubMgBackend.service.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PatchMapping("/{agreement_id}")
    public ResponseEntity<?> addDetailsToAgreement(@Valid @RequestBody Agreement agreement, BindingResult result, @PathVariable String agreement_id) {
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap != null) return  errorMap;

        Client client1 = clientService.updateAgreementDetails(agreement, agreement_id);
        return new ResponseEntity<Agreement>(client1.getAgreement(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> creteNewClient(@Valid @RequestBody Client client, BindingResult result) {

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Client client1 = clientService.saveOrUpdateClient(client);
        return new ResponseEntity<Client>(client, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllClients() {
        Iterable<Client> clients = clientService.findAllClients();
        return new ResponseEntity<Iterable<Client>>(clients, HttpStatus.OK);
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<?> getClientById(@PathVariable String clientId) {
        Client client = clientService.findClientByIdentifier(clientId);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    @DeleteMapping("/{clientId}")
    public ResponseEntity<?> deleteProject(@PathVariable String clientId) {
        clientService.deleteClientByIdentifier(clientId.toUpperCase());
        return new ResponseEntity<String>("Project with ID '" + clientId + "' was deleted!", HttpStatus.OK);
    }
}
