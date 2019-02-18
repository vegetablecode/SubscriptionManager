package com.vegetablecode.SubMgBackend.domain;

import javax.persistence.*;

@Entity
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer tasksSequence = 0;
    private String clientIdentifier;

    // OneToOne with Client

    // OneToMany with Tasks

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

    public Agreement(Long id, Integer tasksSequence, String clientIdentifier, int contractPeriod, int rate, String deviceName, int freeBWCopies, int freeColorCopies, double priceBWCopy, double priceColorCopy, boolean quaterRate, boolean tonerIncluded, boolean printerLease, boolean serviceAgreementOnly, boolean isCopyLimitReached, boolean isInvoicePaid) {
        this.id = id;
        this.tasksSequence = tasksSequence;
        this.clientIdentifier = clientIdentifier;
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
}
