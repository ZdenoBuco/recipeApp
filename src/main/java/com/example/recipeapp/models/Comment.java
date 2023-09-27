package com.example.recipeapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Comment {
    @Id
    private long id;
    private User user;
    private String text;
    private Date createdAtDate;

    public Comment(User user, String text) {
        this.user = user;
        this.text = text;
        createdAtDate = new Date(System.currentTimeMillis());
    }
}
