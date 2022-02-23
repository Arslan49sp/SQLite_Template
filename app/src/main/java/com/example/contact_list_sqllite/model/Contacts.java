package com.example.contact_list_sqllite.model;

public class Contacts {
    private int id;
    private String Name;
    private String phoneNumber;

    public Contacts() {
    }

    public Contacts(int id, String name, String phoneNumber) {
        this.id = id;
        Name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
