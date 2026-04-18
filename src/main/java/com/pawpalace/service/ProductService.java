package com.pawpalace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawpalace.model.Product;
import com.pawpalace.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // ✅ Save product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // ✅ Get all products
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // ✅ Get product by ID
    public Product getProductById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // ✅ Delete product
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}