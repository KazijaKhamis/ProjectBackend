package com.Resta.RestaManagement.Controller;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data


public class FoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Food_ID;
    private String Food_Name;
    private String Food_Cost;

    public FoodItems() {
    }

    public FoodItems(int food_ID, String food_Name, String food_Cost) {
        Food_ID = food_ID;
        Food_Name = food_Name;
        Food_Cost = food_Cost;
    }

    public int getFood_ID() {
        return Food_ID;
    }

    public void setFood_ID(int food_ID) {
        Food_ID = food_ID;
    }

    public String getFood_Name() {
        return Food_Name;
    }

    public void setFood_Name(String food_Name) {
        Food_Name = food_Name;
    }

    public String getFood_Cost() {
        return Food_Cost;
    }

    public void setFood_Cost(String food_Cost) {
        Food_Cost = food_Cost;
    }
}
