package com.example.ecommerce.models;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private double price;

    private boolean available;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}