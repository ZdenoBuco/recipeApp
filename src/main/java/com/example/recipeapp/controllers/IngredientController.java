package com.example.recipeapp.controllers;

import com.example.recipeapp.DTOs.RecipeDTO;
import com.example.recipeapp.models.Ingredient;
import com.example.recipeapp.services.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
public class IngredientController {
    private final IngredientService ingredientService;
    @PostMapping("/ingredients")
    public ResponseEntity<?> addRecipe(@RequestBody Ingredient ingredient) {
        try{
            ingredientService.addIngredient(ingredient);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
