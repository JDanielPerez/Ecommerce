package com.daniel.ecommerce.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date createDate;
    private Date dateReceived;
    private double total;
    
    @ManyToOne
    private user user;

    @OneToOne(mappedBy = "order")
    private orderDetail detail;

    public order(Integer id, String number, Date createDate, Date dateReceived, double total) {
        this.id = id;
        this.number = number;
        this.createDate = createDate;
        this.dateReceived = dateReceived;
        this.total = total;
    }
    
    public order(){

    }
    
    @Override
    public String toString() {
        return "order [id=" + id + ", number=" + number + ", createDate=" + createDate + ", dateReceived="
                + dateReceived + ", total=" + total + "]";
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getDateReceived() {
        return dateReceived;
    }
    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
}
