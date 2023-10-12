package com.example.recipeapp.services.implementations;

import com.example.recipeapp.models.Ingredient;
import com.example.recipeapp.repositories.IngredientRepository;
import com.example.recipeapp.services.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }
}
