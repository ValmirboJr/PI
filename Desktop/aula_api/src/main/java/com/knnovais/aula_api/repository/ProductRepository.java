package com.knnovais.aula_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knnovais.aula_api.model.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

    
} 
