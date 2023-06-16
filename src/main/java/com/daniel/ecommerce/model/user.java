package com.daniel.ecommerce.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String username;
    private String mail;
    private String address;
    private String phone;
    private String type;
    private String password;

//  ESTAMOS RELACIONANDO USUARIOS CON PRODUCTOS PARA CREAR LA RELACION EN LA BASE DE DATOS
    @OneToMany(mappedBy = "user")
    private List<product> products;

    @OneToMany(mappedBy = "user")
    private List<order> orders;

    public user(Integer id, String name, String username, String mail, String address, String phone, String type,
            String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.mail = mail;
        this.address = address;
        this.phone = phone;
        this.type = type;
        this.password = password;
    }

    public user() {
    }

    @Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", username=" + username + ", mail=" + mail + ", address="
                + address + ", phone=" + phone + ", type=" + type + ", password=" + password + "]";
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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<product> getProducts() {
        return products;
    }
    public void setProducts(List<product> products) {
        this.products = products;
    }
    public List<order> getOrders() {
        return orders;
    }
    public void setOrders(List<order> orders) {
        this.orders = orders;
    }
}
