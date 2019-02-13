package com.vegetablecode.SubMgBackend.domain;

import java.util.Date;

public class Appointment {
    private Date date;
    private String note;
    private int numbOfBWCopies;
    private int numbOfColorCopies;

    public Appointment(Date date, String note, int numbOfBWCopies, int numbOfColorCopies) {
        this.date = date;
        this.note = note;
        this.numbOfBWCopies = numbOfBWCopies;
        this.numbOfColorCopies = numbOfColorCopies;
    }

    public Date getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public int getNumbOfBWCopies() {
        return numbOfBWCopies;
    }

    public int getNumbOfColorCopies() {
        return numbOfColorCopies;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setNumbOfBWCopies(int numbOfBWCopies) {
        this.numbOfBWCopies = numbOfBWCopies;
    }

    public void setNumbOfColorCopies(int numbOfColorCopies) {
        this.numbOfColorCopies = numbOfColorCopies;
    }
}
