package com.example.recipeapp.exceptions;

public class IllegalAmountOfIngredientException extends IllegalArgumentException{
        public IllegalAmountOfIngredientException(String message) {
            super(message);
        }
}
