package com.daniel.ecommerce.model;

public class product {
    private Integer id;
    private String name;
    private String description;
    private String image;
    private double price;
    
    public product(Integer id, String name, String description, String image, double price, int amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "product [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", price="
                + price + ", amount=" + amount + "]";
    }

    public product(){

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
    private int amount;
}
