package com.Resta.RestaManagement.Module;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Customer_ID;
    private String Phone_no;
    private String Cus_Name;
    private String Food_Name;
    private String Email;

    public Customer() {
    }

    public Customer(int customer_ID, String phone_no, String cus_Name, String food_Name, String email) {
        Customer_ID = customer_ID;
        Phone_no = phone_no;
        Cus_Name = cus_Name;
        Food_Name = food_Name;
        Email = email;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getPhone_no() {
        return Phone_no;
    }

    public void setPhone_no(String phone_no) {
        Phone_no = phone_no;
    }

    public String getCus_Name() {
        return Cus_Name;
    }

    public void setCus_Name(String cus_Name) {
        Cus_Name = cus_Name;
    }

    public String getFood_Name() {
        return Food_Name;
    }

    public void setFood_Name(String food_Name) {
        Food_Name = food_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
