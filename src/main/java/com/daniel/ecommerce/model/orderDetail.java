package com.daniel.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "details")
public class orderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double amount;
    private double price;
    private double total;
    
    @OneToOne
    private order order;

    @ManyToOne
    private product product;

    public orderDetail(Integer id, String name, double amount, double price, double total) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }
    
    public orderDetail(){
        
    }

    @Override
    public String toString() {
        return "orderDetail [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + ", total="
                + total + "]";
    }

    public Integer getId() {
        return id;
    }    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public order getOrder() {
        return order;
    }
    public void setOrder(order order) {
        this.order = order;
    }
    public product getProduct() {
        return product;
    }
    public void setProduct(product product) {
        this.product = product;
    }

}
