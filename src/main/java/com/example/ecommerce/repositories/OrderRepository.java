package com.example.ecommerce.repositories;

import com.example.ecommerce.models.Order;
import com.example.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Recupera tutti gli ordini di un utente specifico
    List<Order> findByUser(User user);}