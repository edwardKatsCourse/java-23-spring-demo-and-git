package com.telran.main.model;

import java.time.LocalDateTime;

public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDateTime createdOn;


    public Person() {
    }

    public Person(Integer id, String firstName, String lastName, LocalDateTime createdOn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdOn = createdOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
