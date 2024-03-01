package com.devkng.crud.DTO;

public class CustomerSaveDTO {
    private int customerId ;
    private String customerName ;
    private String customeraddress ;
    private int mobile;

    public CustomerSaveDTO() {
    }

    public CustomerSaveDTO(int customerId, String customerName, String customeraddress, int mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customeraddress = customeraddress;
        this.mobile = mobile;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
