package com.vegetablecode.SubMgBackend.exceptions;

public class ClientIdExceptionResponse {

    private String clientIdentifier;

    public ClientIdExceptionResponse(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String projectIdentifier) {
        this.clientIdentifier = projectIdentifier;
    }
}

/*
*
* {
*   "clientIdentifier": "Client ID 'TET22' does not exist!"
*  }
*
* */
