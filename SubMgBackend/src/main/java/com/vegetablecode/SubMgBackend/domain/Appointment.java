package com.vegetablecode.SubMgBackend.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false, unique = true)
    private String clientIdentifier;

    // ManyToOne with Agreement
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "agreement_id", updatable = false, nullable = false)
    @JsonIgnore
    private Agreement agreement;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date date;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date nextDate;
    private String note;
    private int numbOfBWCopies;
    private int numbOfColorCopies;

    public Appointment() {

    }

    public Appointment(Long id, String clientIdentifier, Agreement agreement, Date date, Date nextDate, String note, int numbOfBWCopies, int numbOfColorCopies) {
        this.id = id;
        this.clientIdentifier = clientIdentifier;
        this.agreement = agreement;
        this.date = date;
        this.nextDate = nextDate;
        this.note = note;
        this.numbOfBWCopies = numbOfBWCopies;
        this.numbOfColorCopies = numbOfColorCopies;
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

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getNumbOfBWCopies() {
        return numbOfBWCopies;
    }

    public void setNumbOfBWCopies(int numbOfBWCopies) {
        this.numbOfBWCopies = numbOfBWCopies;
    }

    public Date getNextDate() {
        return nextDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
    }

    public int getNumbOfColorCopies() {
        return numbOfColorCopies;
    }

    public void setNumbOfColorCopies(int numbOfColorCopies) {
        this.numbOfColorCopies = numbOfColorCopies;
    }
}
