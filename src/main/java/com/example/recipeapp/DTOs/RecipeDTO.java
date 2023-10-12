package com.example.recipeapp.DTOs;

import com.example.recipeapp.models.Comment;
import com.example.recipeapp.models.Ingredient;
import com.example.recipeapp.models.User;
import lombok.Data;

import java.util.List;
@Data
public class RecipeDTO {
    private String name;
    private User user;
    private List<Comment> comments;
    private List<Ingredient> ingredients;
    private String imgUrl;
}
