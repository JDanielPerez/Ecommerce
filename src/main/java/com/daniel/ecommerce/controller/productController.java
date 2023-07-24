package com.daniel.ecommerce.controller;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.daniel.ecommerce.model.product;
import com.daniel.ecommerce.model.user;
import com.daniel.ecommerce.service.productService;

@Controller
@RequestMapping("/products")
public class productController {

    private final Logger LOGGER = LoggerFactory.getLogger(productController.class);
//  PERMITE OBTENER TODOS LOS METODOS DE LA CLASE
    @Autowired
    private productService productService;
    
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
        user u = new user(1,"","","","","","","");
        product.setUser(u);
        productService.save(product);
        return "redirect:/products";
    }


    
}
