package com.daniel.ecommerce.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String image;
    private double price;
    private int amount;
    
    @ManyToOne
    private user user;

    @OneToMany(mappedBy = "product")
    private List<orderDetail> orderDetails;

    public product(Integer id, String name, String description, String image, double price, int amount,
            com.daniel.ecommerce.model.user user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.amount = amount;
        this.user = user;
    }
    public product(){

    }
    @Override
    public String toString() {
        return "product [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", price="
                + price + ", amount=" + amount + "]";
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
       public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
    public List<orderDetail> getOrderDetails() {
        return orderDetails;
    }
    public void setOrderDetails(List<orderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
