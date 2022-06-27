package com.example.demo.domain;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

public class Supplier extends Person {
    public String specialty;
    public List<User> users = new ArrayList<>();

    public Supplier() {
    }

    public Supplier(int id, String firstName, String lastName, String zipcode, String city, String adres,
                    String password, String mailadress, int phoneNumber, String specialty, ArrayList<User> users) {
        super(id, firstName, lastName, zipcode, city, adres, password, mailadress, phoneNumber);
        this.specialty = specialty;
        this.users = users;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }
}
