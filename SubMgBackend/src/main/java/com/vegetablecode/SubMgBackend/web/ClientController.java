package com.vegetablecode.SubMgBackend.web;

import com.vegetablecode.SubMgBackend.domain.Client;
import com.vegetablecode.SubMgBackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/clients")
@CrossOrigin
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("")
    public ResponseEntity<?> addClient(@Valid @RequestBody Client client, BindingResult result) {
        if(result.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();
            for(FieldError error: result.getFieldErrors()) {
                errorMap.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
        }

        Client newClient = clientService.saveOrUpdateClient(client);
        return new ResponseEntity<Client>(newClient, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Client> getAllClients() {
        return clientService.findAll();
    }

    @GetMapping("/{client_id}")
    public ResponseEntity<?> getClientById(@PathVariable Long client_id) {
        Client client = clientService.findById(client_id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @DeleteMapping("/{client_id}")
    public ResponseEntity<?> deleteClient(@PathVariable Long client_id) {
        clientService.delete(client_id);
        return new ResponseEntity<String>("Client deleted", HttpStatus.OK);
    }
}
