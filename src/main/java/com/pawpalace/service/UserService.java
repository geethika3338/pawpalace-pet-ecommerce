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
    public String register(User user) {

        if (user.getEmail() == null || user.getPassword() == null) {
            return "Email and Password required";
        }

        if (user.getRole() == null) {
            user.setRole("USER");  // default role
        }

        repository.save(user);
        return "User Registered Successfully";
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

        return "Login Successful - Role: " + user.getRole();
    }
}