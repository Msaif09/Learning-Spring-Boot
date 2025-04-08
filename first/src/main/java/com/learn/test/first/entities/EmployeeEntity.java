package com.learn.test.first.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean active;

    public EmployeeEntity(Long id, String name, LocalDate dateOfJoining, boolean active) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.active = active;
    }
    public EmployeeEntity(){

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getDateOfJoining() {
        return this.dateOfJoining;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
