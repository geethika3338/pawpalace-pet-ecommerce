package com.pawpalace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawpalace.model.User;
import com.pawpalace.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    // REGISTER
    public User register(User user) {
        return repository.save(user);
    }

    // LOGIN
    public String login(String email, String password) {
        User user = repository.findByEmail(email);

        if (user == null) {
            return "User not found";
        }

        if (!user.getPassword().equals(password)) {
            return "Invalid password";
        }

        return "Login successful";
    }
}