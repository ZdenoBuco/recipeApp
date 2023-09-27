package com.example.recipeapp.models;

import com.example.recipeapp.exceptions.IllegalAmountOfIngredientException;
import com.example.recipeapp.exceptions.IllegalUnitTypeOfIngredientException;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ingredient {
    @Id
    private String name;
    private int amount;
    private String unit;

    public Ingredient(String name, int amount, String unit) {
    this.name = name;
    this.amount = amount;
    this.unit = unit;
    }
    public void setAmount(int amount){
        if (amount <= 0) {
            throw new IllegalAmountOfIngredientException("Amount of Ingredient must be more than 0");
        } else {
            this.amount = amount;
        }
    }
    public void setUnit(String unit) {
        List<String> listOfUnits = List.of("g", "kg", "ml", "l", "pcs", "to taste", "pinch of");
        if (!listOfUnits.contains(unit)) {
            throw new IllegalUnitTypeOfIngredientException("Unit type must be: g, kg, ml, l, pcs, to taste or pinch of");
        } else {
            this.unit = unit;
        }
    }
}
