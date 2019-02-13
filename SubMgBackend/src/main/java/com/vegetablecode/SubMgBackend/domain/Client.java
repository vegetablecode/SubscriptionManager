package com.vegetablecode.SubMgBackend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String nip;
    private String email;
    private String phone;
    private int contractPeriod;
    private int rate;
    private Date beginDate;
    private Date nextDate;
    private Date lastDate;
    private String deviceName;
    private int freeBWCopies;
    private int freeColorCopies;
    private double priceBWCopy;
    private double priceColorCopy;
    private int initialBWCopies;
    private int initialColorCopies;
    private int prevBWCopies;
    private int prevColorCopies;
    private ArrayList<Task> tasks;
    private ArrayList<Appointment> appointments;
    private boolean quaterRate;
    private boolean tonerIncluded;
    private boolean printerLease;
    private boolean serviceAgreementOnly;
    private boolean isCopyLimitReached;
    private boolean isInvoicePaid;

    public Client(Long id, String name, String nip, String email, String phone, int contractPeriod, int rate, Date beginDate, Date nextDate, Date lastDate, String deviceName, int freeBWCopies, int freeColorCopies, double priceBWCopy, double priceColorCopy, int initialBWCopies, int initialColorCopies, int prevBWCopies, int prevColorCopies, ArrayList<Task> tasks, ArrayList<Appointment> appointments, boolean quaterRate, boolean tonerIncluded, boolean printerLease, boolean serviceAgreementOnly, boolean isCopyLimitReached, boolean isInvoicePaid) {
        this.id = id;
        this.name = name;
        this.nip = nip;
        this.email = email;
        this.phone = phone;
        this.contractPeriod = contractPeriod;
        this.rate = rate;
        this.beginDate = beginDate;
        this.nextDate = nextDate;
        this.lastDate = lastDate;
        this.deviceName = deviceName;
        this.freeBWCopies = freeBWCopies;
        this.freeColorCopies = freeColorCopies;
        this.priceBWCopy = priceBWCopy;
        this.priceColorCopy = priceColorCopy;
        this.initialBWCopies = initialBWCopies;
        this.initialColorCopies = initialColorCopies;
        this.prevBWCopies = prevBWCopies;
        this.prevColorCopies = prevColorCopies;
        this.tasks = tasks;
        this.appointments = appointments;
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

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getContractPeriod() {
        return contractPeriod;
    }

    public int getRate() {
        return rate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getNextDate() {
        return nextDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public int getFreeBWCopies() {
        return freeBWCopies;
    }

    public int getFreeColorCopies() {
        return freeColorCopies;
    }

    public double getPriceBWCopy() {
        return priceBWCopy;
    }

    public double getPriceColorCopy() {
        return priceColorCopy;
    }

    public int getInitialBWCopies() {
        return initialBWCopies;
    }

    public int getInitialColorCopies() {
        return initialColorCopies;
    }

    public int getPrevBWCopies() {
        return prevBWCopies;
    }

    public int getPrevColorCopies() {
        return prevColorCopies;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public boolean isQuaterRate() {
        return quaterRate;
    }

    public boolean isTonerIncluded() {
        return tonerIncluded;
    }

    public boolean isPrinterLease() {
        return printerLease;
    }

    public boolean isServiceAgreementOnly() {
        return serviceAgreementOnly;
    }

    public boolean isCopyLimitReached() {
        return isCopyLimitReached;
    }

    public boolean isInvoicePaid() {
        return isInvoicePaid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setFreeBWCopies(int freeBWCopies) {
        this.freeBWCopies = freeBWCopies;
    }

    public void setFreeColorCopies(int freeColorCopies) {
        this.freeColorCopies = freeColorCopies;
    }

    public void setPriceBWCopy(double priceBWCopy) {
        this.priceBWCopy = priceBWCopy;
    }

    public void setPriceColorCopy(double priceColorCopy) {
        this.priceColorCopy = priceColorCopy;
    }

    public void setInitialBWCopies(int initialBWCopies) {
        this.initialBWCopies = initialBWCopies;
    }

    public void setInitialColorCopies(int initialColorCopies) {
        this.initialColorCopies = initialColorCopies;
    }

    public void setPrevBWCopies(int prevBWCopies) {
        this.prevBWCopies = prevBWCopies;
    }

    public void setPrevColorCopies(int prevColorCopies) {
        this.prevColorCopies = prevColorCopies;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void setQuaterRate(boolean quaterRate) {
        this.quaterRate = quaterRate;
    }

    public void setTonerIncluded(boolean tonerIncluded) {
        this.tonerIncluded = tonerIncluded;
    }

    public void setPrinterLease(boolean printerLease) {
        this.printerLease = printerLease;
    }

    public void setServiceAgreementOnly(boolean serviceAgreementOnly) {
        this.serviceAgreementOnly = serviceAgreementOnly;
    }

    public void setCopyLimitReached(boolean copyLimitReached) {
        isCopyLimitReached = copyLimitReached;
    }

    public void setInvoicePaid(boolean invoicePaid) {
        isInvoicePaid = invoicePaid;
    }
}
