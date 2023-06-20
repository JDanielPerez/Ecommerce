package com.daniel.ecommerce.service;

import java.util.Optional;

import com.daniel.ecommerce.model.product;

public interface productService {
    
    public product save(product producto);
    //OPTIONAL POR SI EL REGISTRO NO EXISTE
    public Optional<product> get(Integer id);
    public void update(product producto);
    public void delete(Integer id);
}
