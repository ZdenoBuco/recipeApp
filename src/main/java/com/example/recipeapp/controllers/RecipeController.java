package com.example.recipeapp.controllers;

import com.example.recipeapp.DTOs.RecipeDTO;
import com.example.recipeapp.services.implementations.RecipeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RecipeController {
    private final RecipeServiceImpl recipeService;

    @GetMapping("/recipes")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(recipeService.getAll());
    }
    @PostMapping("/recipes")
    public ResponseEntity<?> addRecipe(@RequestBody RecipeDTO recipeDTO) {
        try{
            recipeService.addRecipe(recipeDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
