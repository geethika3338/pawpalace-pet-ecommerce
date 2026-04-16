package com.pawpalace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pawpalace.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}