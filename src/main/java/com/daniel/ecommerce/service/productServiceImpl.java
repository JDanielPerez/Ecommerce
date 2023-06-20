package com.daniel.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.ecommerce.model.product;
import com.daniel.ecommerce.repository.productRepository;

@Service
public class productServiceImpl implements productService{

    //Estamos inyectado un objeto a esta clase
    //Para obtener todos los metodos crud que nos ofrece jpa
    @Autowired
    private productRepository productRepository;

    public  product save(product producto){
        return productRepository.save(producto);
    }
    public Optional<product> get(Integer id){
        return productRepository.findById(id);
    }
    public void update(product producto){
        productRepository.save(producto);
    }
    public void delete(Integer id){
        productRepository.deleteById(id);
    }
    
}
