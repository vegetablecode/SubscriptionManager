package com.vegetablecode.SubMgBackend.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank!")
    private String name;
    private String nip;
    private String email;
    private String phone;
    private int contractPeriod;
    private int rate;
    private String deviceName;
    private int freeBWCopies;
    private int freeColorCopies;
    private double priceBWCopy;
    private double priceColorCopy;

    /* TASKS START */

    @ElementCollection
    @CollectionTable(name="tasks")
    private List<String> tasks = new ArrayList<String>();

    @ElementCollection
    @CollectionTable(name="importantTasks")
    private List<String> importantTasks = new ArrayList<String>();

    /* TASKS END */

    /* APPOINTMENTS START */

    @ElementCollection
    @CollectionTable(name="appointments")
    private List<String> appointments;

    @ElementCollection
    @CollectionTable(name="dates")
    private List<Date> dates;

    @ElementCollection
    @CollectionTable(name="bwCopyCounters")
    private List<Integer> bwCopyCounters;

    @ElementCollection
    @CollectionTable(name="colorCopyCounters")
    private List<Integer> colorCopyCounters;

    /* APPOINTMENTS END */

    @Column(name = "quaterRate")
    private boolean quaterRate;
    @Column(name = "tonerIncluded")
    private boolean tonerIncluded;
    @Column(name = "printerLease")
    private boolean printerLease;
    @Column(name = "serviceAgreementOnly")
    private boolean serviceAgreementOnly;
    @Column(name = "isCopyLimitReached")
    private boolean isCopyLimitReached;
    @Column(name = "isInvoicePaid")
    private boolean isInvoicePaid;

   public Client() {

   }

    public Client(Long id, @NotBlank(message = "Name cannot be blank!") String name, String nip, String email, String phone, int contractPeriod, int rate, String deviceName, int freeBWCopies, int freeColorCopies, double priceBWCopy, double priceColorCopy, List<String> tasks, List<String> importantTasks, List<String> appointments, List<Date> dates, List<Integer> bwCopyCounters, List<Integer> colorCopyCounters, boolean quaterRate, boolean tonerIncluded, boolean printerLease, boolean serviceAgreementOnly, boolean isCopyLimitReached, boolean isInvoicePaid) {
        this.id = id;
        this.name = name;
        this.nip = nip;
        this.email = email;
        this.phone = phone;
        this.contractPeriod = contractPeriod;
        this.rate = rate;
        this.deviceName = deviceName;
        this.freeBWCopies = freeBWCopies;
        this.freeColorCopies = freeColorCopies;
        this.priceBWCopy = priceBWCopy;
        this.priceColorCopy = priceColorCopy;
        this.tasks = tasks;
        this.importantTasks = importantTasks;
        this.appointments = appointments;
        this.dates = dates;
        this.bwCopyCounters = bwCopyCounters;
        this.colorCopyCounters = colorCopyCounters;
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

    public List<String> getTasks() {
        return tasks;
    }

    public List<String> getImportantTasks() {
        return importantTasks;
    }

    public List<String> getAppointments() {
        return appointments;
    }

    public List<Date> getDates() {
        return dates;
    }

    public List<Integer> getBwCopyCounters() {
        return bwCopyCounters;
    }

    public List<Integer> getColorCopyCounters() {
        return colorCopyCounters;
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

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public void setImportantTasks(List<String> importantTasks) {
        this.importantTasks = importantTasks;
    }

    public void setAppointments(List<String> appointments) {
        this.appointments = appointments;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public void setBwCopyCounters(List<Integer> bwCopyCounters) {
        this.bwCopyCounters = bwCopyCounters;
    }

    public void setColorCopyCounters(List<Integer> colorCopyCounters) {
        this.colorCopyCounters = colorCopyCounters;
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
