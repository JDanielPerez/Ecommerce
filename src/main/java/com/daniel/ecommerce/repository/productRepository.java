package com.daniel.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.ecommerce.model.product;

@Repository
public interface productRepository extends JpaRepository<product, Integer>{
    
}
