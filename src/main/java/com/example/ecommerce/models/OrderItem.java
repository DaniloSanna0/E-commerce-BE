package com.example.ecommerce.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_items")
public class OrderItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    private BigDecimal price;

    public OrderItem(int id, Product product, Order order, int quantity, BigDecimal  price) {
        this.id = id;
        this.product = product;
        this.order = order;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal  getPrice() {
        return price;
    }

    public void setPrice(BigDecimal  price) {
        this.price = price;
    }
}