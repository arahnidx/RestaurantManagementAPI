package com.api.RestaurantManagement.models;


import javax.persistence.*;
import java.io.Serial;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_CUSTOMER")
public class Customer {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customerId;
    @Column(nullable = false)
    protected double creditBalance;
    @Column(nullable = false, length = 30)
    protected String customerName;
    @Column(nullable = false, length = 30)
    protected String customerEmail;
    @Column(nullable = false, length = 15)
    protected String customerPhone;
    @Column(nullable = false, length = 40)
    protected String customerAddress;
    @Column(nullable = false, length = 30)
    protected String customerCity;
    @Column(nullable = false, length = 30)
    protected String customerState;
    @Column(nullable = false, length = 8)
    protected String customerZip;
    @Column(nullable = false, length = 30)
    protected String customerCountry;
    @Column(nullable = false)
    protected String customerBirthDate;
    @Column(nullable = false, length = 15)
    protected String customerStatus;
    @Column(nullable = false, length = 30)
    protected String customerCreatedBy;
    @Column(nullable = false)
    protected LocalDateTime customerCreatedDate;
    @Column(nullable = false, length = 30)
    protected String customerModifiedBy;
    @Column(nullable = true)
    protected LocalDateTime customerModifiedDate;


    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getCustomerBirthDate() {
        return customerBirthDate;
    }

    public void setCustomerBirthDate(String customerBirthDate) {
        this.customerBirthDate = customerBirthDate;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerCreatedBy() {
        return customerCreatedBy;
    }

    public void setCustomerCreatedBy(String customerCreatedBy) {
        this.customerCreatedBy = customerCreatedBy;
    }

    public LocalDateTime getCustomerCreatedDate() {
        return customerCreatedDate;
    }

    public void setCustomerCreatedDate(LocalDateTime customerCreatedDate) {
        this.customerCreatedDate = customerCreatedDate;
    }

    public String getCustomerModifiedBy() {
        return customerModifiedBy;
    }

    public void setCustomerModifiedBy(String customerModifiedBy) {
        this.customerModifiedBy = customerModifiedBy;
    }

    public LocalDateTime getCustomerModifiedDate() {
        return customerModifiedDate;
    }

    public void setCustomerModifiedDate(LocalDateTime customerModifiedDate) {
        this.customerModifiedDate = customerModifiedDate;
    }
}
