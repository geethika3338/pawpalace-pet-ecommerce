package com.pawpalace.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pawpalace.model.Product;

@Service
public class ProductService {

    // Temporary storage (instead of database)
    private List<Product> products = new ArrayList<>();

    // GET all products
    public List<Product> getAllProducts() {
        return products;
    }

    // ADD product
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    // DELETE product
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}