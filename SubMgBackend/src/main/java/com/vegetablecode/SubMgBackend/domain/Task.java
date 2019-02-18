package com.vegetablecode.SubMgBackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    private String clientSequence;
    private String clientIdentifier;

    // ManyToOne with Agreement

    private String summary;
    private boolean isDone;
    private Integer priority;

    public Task() {

    }

    public Task(Long id, String clientSequence, String clientIdentifier, String summary, boolean isDone, Integer priority) {
        this.id = id;
        this.clientSequence = clientSequence;
        this.clientIdentifier = clientIdentifier;
        this.summary = summary;
        this.isDone = isDone;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientSequence() {
        return clientSequence;
    }

    public void setClientSequence(String clientSequence) {
        this.clientSequence = clientSequence;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", clientSequence='" + clientSequence + '\'' +
                ", clientIdentifier='" + clientIdentifier + '\'' +
                ", summary='" + summary + '\'' +
                ", isDone=" + isDone +
                ", priority=" + priority +
                '}';
    }
}
