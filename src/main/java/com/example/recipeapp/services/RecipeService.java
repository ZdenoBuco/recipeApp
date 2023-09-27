package com.example.recipeapp.services;

import com.example.recipeapp.models.Recipe;

public interface RecipeService {
    Iterable<Recipe> getAll();
}
