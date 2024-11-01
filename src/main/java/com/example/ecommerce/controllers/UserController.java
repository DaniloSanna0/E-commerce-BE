package com.example.ecommerce.controllers;

import com.example.ecommerce.models.User;
import com.example.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    private User user;

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        System.out.println("Ricevuto utente: " + user.getUsername() + ", " + user.getEmail() + ", " + user.getPassword());
        return userService.findUserByUsername(username);
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}