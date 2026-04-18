package com.pawpalace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pawpalace.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}