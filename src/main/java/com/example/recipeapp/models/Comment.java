package com.example.recipeapp.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_email", referencedColumnName = "email")
    private User user;
    private String text;
    private Date createdAtDate;

    public Comment(User user, String text) {
        this.user = user;
        this.text = text;
        createdAtDate = new Date(System.currentTimeMillis());
    }
}
