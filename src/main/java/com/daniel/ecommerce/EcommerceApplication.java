package com.daniel.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//SE EXCLUYE ESTA CLASE PARA QUE NO HAGA LA CONEXIÓN AUTOMATICAMENTE A LA BASE DE DATOS QUE AUN NO ESTA CONFIGURADA
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
