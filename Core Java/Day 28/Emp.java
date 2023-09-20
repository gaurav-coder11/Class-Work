package com.gaurav.project;

// Import necessary packages
import java.io.Serializable;

public class Emp implements Serializable {
    private int id;
    private String name;

    // Default constructor
    public Emp() {

    }

    // Getter method for id
    public int getId() {
        return id;
    }

    // Setter method for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}
