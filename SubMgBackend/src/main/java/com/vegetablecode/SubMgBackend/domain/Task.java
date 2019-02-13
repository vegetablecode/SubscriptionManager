package com.vegetablecode.SubMgBackend.domain;

public class Task {
    String name;
    boolean isDone;
    boolean isImportant;

    public Task(String name, boolean isDone, boolean isImportant) {
        this.name = name;
        this.isDone = isDone;
        this.isImportant = isImportant;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return isDone;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }
}
