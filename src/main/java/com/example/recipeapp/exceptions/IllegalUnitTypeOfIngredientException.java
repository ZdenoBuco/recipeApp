package com.example.recipeapp.exceptions;

public class IllegalUnitTypeOfIngredientException extends IllegalArgumentException{
    public IllegalUnitTypeOfIngredientException(String message) {
        super(message);
    }
}
