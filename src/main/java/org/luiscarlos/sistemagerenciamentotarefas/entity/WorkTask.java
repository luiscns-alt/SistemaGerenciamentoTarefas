package org.luiscarlos.sistemagerenciamentotarefas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WorkTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String workTaskAttribute;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkTaskAttribute() {
        return workTaskAttribute;
    }

    public void setWorkTaskAttribute(String workTaskAttribute) {
        this.workTaskAttribute = workTaskAttribute;
    }
}
