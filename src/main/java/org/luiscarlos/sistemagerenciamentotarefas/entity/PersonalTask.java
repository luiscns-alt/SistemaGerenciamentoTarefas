package org.luiscarlos.sistemagerenciamentotarefas.entity;

import jakarta.persistence.Entity;

@Entity
public class PersonalTask extends Task {
    private String personalTaskAttribute;

    public String getPersonalTaskAttribute() {
        return personalTaskAttribute;
    }

    public void setPersonalTaskAttribute(String personalTaskAttribute) {
        this.personalTaskAttribute = personalTaskAttribute;
    }
}