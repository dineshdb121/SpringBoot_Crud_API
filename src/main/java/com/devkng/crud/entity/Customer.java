package com.devkng.crud.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "customer")
public class Customer {



    @Id
    @Column(name = "customer_id" ,length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId ;
    @Column(name = "customer_name" ,length = 50)
    private String customerName ;
    @Column(name = "customer_address" ,length = 50)
    private String customeraddress ;
    @Column(name = "mobile" ,length = 50)
    private int mobile;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customeraddress, int mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
    }

    public Customer(String customerName, String customeraddress, int mobile) {
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomeraddress() {
        return customeraddress;
    }
    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }
    public int getMobile() {
        return mobile;
    }
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

}




