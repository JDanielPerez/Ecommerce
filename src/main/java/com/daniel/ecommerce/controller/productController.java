package com.daniel.ecommerce.controller;

import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.daniel.ecommerce.model.product;

@Controller
@RequestMapping("/products")
public class productController {

    private final Logger LOGGER = LoggerFactory.getLogger(productController.class);

    @GetMapping("")
    public String show(){
        return "products/show";
    }

    @GetMapping("/create")
    public String create(){
        return "products/create";
    }

    @PostMapping("/save")
    public String save(product product){
        LOGGER.info("Este es el objeto producto de la vista {}", product);
        return "redirect:/product";
    }


    
}
