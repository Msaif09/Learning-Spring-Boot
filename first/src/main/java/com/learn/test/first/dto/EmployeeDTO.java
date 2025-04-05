package com.learn.test.first.dto;

import java.time.LocalDate;



public class EmployeeDTO {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean active;

    public EmployeeDTO(Long id, String name, LocalDate dateOfJoining, boolean active) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.active = active;
    }

    public EmployeeDTO() {
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
