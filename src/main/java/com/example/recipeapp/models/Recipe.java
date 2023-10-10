package com.example.recipeapp.models;

import com.example.recipeapp.DTOs.RecipeDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_email", referencedColumnName = "email")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private List<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_name", referencedColumnName = "name")
    private List<Ingredient> ingredients;

    private String photoUrl;
    private Date createdAtDate;

    public Recipe(String name, User user, List<Ingredient> ingredients, String photoUrl){
        this.name = name;
        this.user = user;
        this.ingredients = ingredients;
        this.photoUrl = photoUrl;
        createdAtDate = new Date(System.currentTimeMillis());
    }
    public Recipe(RecipeDTO recipeDTO){
        this.name = recipeDTO.getName();
        this.user = recipeDTO.getUser();
        this.ingredients = recipeDTO.getIngredients();
        this.photoUrl = recipeDTO.getImgUrl();
        createdAtDate = new Date(System.currentTimeMillis());
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}
