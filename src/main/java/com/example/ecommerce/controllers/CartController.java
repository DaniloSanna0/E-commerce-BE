package com.example.ecommerce.controllers;

import com.example.ecommerce.models.CartItem;
import com.example.ecommerce.models.User;
import com.example.ecommerce.services.CartService;
import com.example.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public List<CartItem> getCartByUser(@PathVariable String username) {
        User user = userService.findUserByUsername(username);
        return cartService.findCartItemsByUser(user);
    }

    @PostMapping("/add")
    public CartItem addItemToCart(@RequestBody CartItem cartItem) {
        return cartService.addItemToCart(cartItem);
    }

    @DeleteMapping("/remove/{cartItemId}")
    public void removeItemFromCart(@PathVariable Long cartItemId) {
        cartService.removeItemFromCart(cartItemId);
    }
}