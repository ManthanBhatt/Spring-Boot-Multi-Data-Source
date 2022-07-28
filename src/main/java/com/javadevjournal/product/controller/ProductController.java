package com.javadevjournal.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javadevjournal.product.data.ProductModel;
import com.javadevjournal.product.repo.ProductRepository;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    // Get All Notes
    @GetMapping("/products")
    public List<ProductModel> getAllNotes() {
        return productRepository.findAll();
    }
}