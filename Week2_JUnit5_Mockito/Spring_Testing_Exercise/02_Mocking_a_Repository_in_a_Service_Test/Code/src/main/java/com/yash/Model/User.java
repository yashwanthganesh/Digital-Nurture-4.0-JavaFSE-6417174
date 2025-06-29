package com.yash.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;
    private String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
