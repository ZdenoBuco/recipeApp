package com.example.recipeapp.models;

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
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "", referencedColumnName = "")
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "", referencedColumnName = "")
    private List<Comment> comments;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "", referencedColumnName = "")
    private List<Ingredient> ingredients;
    private String photoUrl;
    private Date dateOfCreation;

    public Recipe(String name, User user, List<Ingredient> ingredients, String photoUrl){
        this.name = name;
        this.user = user;
        this.ingredients = ingredients;
        this.photoUrl = photoUrl;
        dateOfCreation = new Date(System.currentTimeMillis());
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}
