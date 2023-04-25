package com.example.swagger.models;


public class Customer {
    private String name, surname, lastname, group, email;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", group='" + group + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Customer(String name, String surname, String lastname, String group, String email) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.group = group;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
