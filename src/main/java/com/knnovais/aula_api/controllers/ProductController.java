package com.knnovais.aula_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knnovais.aula_api.model.Product;
import com.knnovais.aula_api.repository.ProductRepository;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
