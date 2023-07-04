package com.Resta.RestaManagement.Module;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Admin_ID;
    private String Adm_Name;
    private int password;
    private int Menu_ID;
    private String status;


    public Admin() {
    }

    public Admin(int admin_ID, String adm_Name, int password, int menu_ID, String status) {
        Admin_ID = admin_ID;
        Adm_Name = adm_Name;
        this.password = password;
        Menu_ID = menu_ID;
        this.status = status;
    }

    public int getAdmin_ID() {
        return Admin_ID;
    }

    public void setAdmin_ID(int admin_ID) {
        Admin_ID = admin_ID;
    }

    public String getAdm_Name() {
        return Adm_Name;
    }

    public void setAdm_Name(String adm_Name) {
        Adm_Name = adm_Name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getMenu_ID() {
        return Menu_ID;
    }

    public void setMenu_ID(int menu_ID) {
        Menu_ID = menu_ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
