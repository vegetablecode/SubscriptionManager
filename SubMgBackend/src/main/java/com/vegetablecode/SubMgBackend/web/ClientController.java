package com.vegetablecode.SubMgBackend.web;


import com.vegetablecode.SubMgBackend.domain.Client;
import com.vegetablecode.SubMgBackend.service.ClientService;
import com.vegetablecode.SubMgBackend.service.MapValidationErrorService;
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
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> creteNewClient(@Valid @RequestBody Client client, BindingResult result) {

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Client client1 = clientService.saveOrUpdateClient(client);
        return new ResponseEntity<Client>(client, HttpStatus.CREATED);
    }

}
