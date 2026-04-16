package com.pawpalace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pawpalace.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}