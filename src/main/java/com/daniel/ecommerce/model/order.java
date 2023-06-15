package com.daniel.ecommerce.model;

import java.util.Date;

public class order {
    private Integer id;
    private String number;
    private Date createDate;
    private Date dateReceived;
    private double total;
    
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

}
