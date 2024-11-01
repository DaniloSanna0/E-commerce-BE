package com.example.ecommerce.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String status;

    private double totalAmount;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    public Order() {
        this.createdAt = LocalDateTime.now();
        this.status = "In Attesa";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}