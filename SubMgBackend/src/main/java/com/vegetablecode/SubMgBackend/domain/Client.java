package com.vegetablecode.SubMgBackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min=4, max=5, message = "Please use 4 to 5 characters")
    @Column(updatable = false, unique = true)
    private String clientIdentifier;

    @NotBlank(message = "Name cannot be blank!")
    private String name;
    @NotBlank(message ="NIP cannot be blank!")
    private String nip;
    @NotBlank(message ="e-mail cannot be blank!")
    private String email;
    @NotBlank(message ="Phone number cannot be blank!")
    private String phone;

    // OneToOne with Agreement
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "client")
    @JsonIgnore
    private Agreement agreement;

    public Client() {

    }

    public Client(Long id, @Size(min = 4, max = 5, message = "Please use 4 to 5 characters") String clientIdentifier, @NotBlank(message = "Name cannot be blank!") String name, @NotBlank(message = "NIP cannot be blank!") String nip, @NotBlank(message = "e-mail cannot be blank!") String email, @NotBlank(message = "Phone number cannot be blank!") String phone, Agreement agreement) {
        this.id = id;
        this.clientIdentifier = clientIdentifier;
        this.name = name;
        this.nip = nip;
        this.email = email;
        this.phone = phone;
        this.agreement = agreement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
}
