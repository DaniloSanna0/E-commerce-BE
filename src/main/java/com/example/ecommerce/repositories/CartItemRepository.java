package com.example.ecommerce.repositories;

import com.example.ecommerce.models.CartItem;
import com.example.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // Recupera gli articoli del carrello di un utente specifico
    List<CartItem> findByUser(User user);
}