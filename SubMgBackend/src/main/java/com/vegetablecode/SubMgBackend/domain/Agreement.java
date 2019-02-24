package com.vegetablecode.SubMgBackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer tasksSequence = 0;
    @Column(updatable = false)
    private String clientIdentifier;

    // OneToOne with Client
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", nullable = false)
    @JsonIgnore
    private Client client;

    // OneToMany with Tasks
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "agreement", orphanRemoval = true)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Task> tasks = new ArrayList<>();

    // OneToMany with Appointments
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "agreement", orphanRemoval = true)
    private List<Appointment> appointments = new ArrayList<>();

    private int contractPeriod;
    private int rate;
    private String deviceName;
    private int freeBWCopies;
    private int freeColorCopies;
    private double priceBWCopy;
    private double priceColorCopy;

    private boolean quaterRate;
    private boolean tonerIncluded;
    private boolean printerLease;
    private boolean serviceAgreementOnly;
    private boolean isCopyLimitReached;
    private boolean isInvoicePaid;

    public Agreement() {

    }

    public Agreement(Long id, Integer tasksSequence, String clientIdentifier, Client client, List<Task> tasks, List<Appointment> appointments, int contractPeriod, int rate, String deviceName, int freeBWCopies, int freeColorCopies, double priceBWCopy, double priceColorCopy, boolean quaterRate, boolean tonerIncluded, boolean printerLease, boolean serviceAgreementOnly, boolean isCopyLimitReached, boolean isInvoicePaid) {
        this.id = id;
        this.tasksSequence = tasksSequence;
        this.clientIdentifier = clientIdentifier;
        this.client = client;
        this.tasks = tasks;
        this.appointments = appointments;
        this.contractPeriod = contractPeriod;
        this.rate = rate;
        this.deviceName = deviceName;
        this.freeBWCopies = freeBWCopies;
        this.freeColorCopies = freeColorCopies;
        this.priceBWCopy = priceBWCopy;
        this.priceColorCopy = priceColorCopy;
        this.quaterRate = quaterRate;
        this.tonerIncluded = tonerIncluded;
        this.printerLease = printerLease;
        this.serviceAgreementOnly = serviceAgreementOnly;
        this.isCopyLimitReached = isCopyLimitReached;
        this.isInvoicePaid = isInvoicePaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTasksSequence() {
        return tasksSequence;
    }

    public void setTasksSequence(Integer tasksSequence) {
        this.tasksSequence = tasksSequence;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getFreeBWCopies() {
        return freeBWCopies;
    }

    public void setFreeBWCopies(int freeBWCopies) {
        this.freeBWCopies = freeBWCopies;
    }

    public int getFreeColorCopies() {
        return freeColorCopies;
    }

    public void setFreeColorCopies(int freeColorCopies) {
        this.freeColorCopies = freeColorCopies;
    }

    public double getPriceBWCopy() {
        return priceBWCopy;
    }

    public void setPriceBWCopy(double priceBWCopy) {
        this.priceBWCopy = priceBWCopy;
    }

    public double getPriceColorCopy() {
        return priceColorCopy;
    }

    public void setPriceColorCopy(double priceColorCopy) {
        this.priceColorCopy = priceColorCopy;
    }

    public boolean isQuaterRate() {
        return quaterRate;
    }

    public void setQuaterRate(boolean quaterRate) {
        this.quaterRate = quaterRate;
    }

    public boolean isTonerIncluded() {
        return tonerIncluded;
    }

    public void setTonerIncluded(boolean tonerIncluded) {
        this.tonerIncluded = tonerIncluded;
    }

    public boolean isPrinterLease() {
        return printerLease;
    }

    public void setPrinterLease(boolean printerLease) {
        this.printerLease = printerLease;
    }

    public boolean isServiceAgreementOnly() {
        return serviceAgreementOnly;
    }

    public void setServiceAgreementOnly(boolean serviceAgreementOnly) {
        this.serviceAgreementOnly = serviceAgreementOnly;
    }

    public boolean isCopyLimitReached() {
        return isCopyLimitReached;
    }

    public void setCopyLimitReached(boolean copyLimitReached) {
        isCopyLimitReached = copyLimitReached;
    }

    public boolean isInvoicePaid() {
        return isInvoicePaid;
    }

    public void setInvoicePaid(boolean invoicePaid) {
        isInvoicePaid = invoicePaid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void updateDetails(Agreement agreement) {
        this.contractPeriod = agreement.contractPeriod;
        this.rate = agreement.rate;
        this.deviceName = agreement.deviceName;
        this.freeBWCopies = agreement.freeBWCopies;
        this.freeColorCopies = agreement.freeColorCopies;
        this.priceBWCopy = agreement.priceBWCopy;
        this.priceColorCopy = agreement.priceColorCopy;
        this.quaterRate = agreement.quaterRate;
        this.tonerIncluded = agreement.tonerIncluded;
        this.printerLease = agreement.printerLease;
        this.serviceAgreementOnly = agreement.serviceAgreementOnly;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
