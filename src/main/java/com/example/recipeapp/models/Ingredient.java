package com.example.recipeapp.models;

import com.example.recipeapp.enums.Unit;
import com.example.recipeapp.exceptions.IllegalAmountOfIngredientException;
import com.example.recipeapp.exceptions.IllegalUnitTypeOfIngredientException;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    private Integer amount;
    @Enumerated(EnumType.STRING)
    private Unit unit;

    public Ingredient(String name, Integer amount, Unit unit) {
    this.name = name;
    this.amount = amount;
    this.unit = unit;
    }
    public void setAmount(Integer amount){
            this.amount = amount;
    }
}
