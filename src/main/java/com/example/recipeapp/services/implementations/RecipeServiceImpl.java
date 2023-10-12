package com.example.recipeapp.services.implementations;

import com.example.recipeapp.DTOs.RecipeDTO;
import com.example.recipeapp.models.Recipe;
import com.example.recipeapp.repositories.RecipeRepository;
import com.example.recipeapp.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    @Override
    public Iterable<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    @Override
    public void addRecipe(RecipeDTO recipeDTO) {
        recipeRepository.save(new Recipe(recipeDTO));
    }
}
