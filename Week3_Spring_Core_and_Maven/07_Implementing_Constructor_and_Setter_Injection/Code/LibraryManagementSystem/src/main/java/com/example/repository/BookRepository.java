package com.example.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository Created");
    }

    public List<String> getBooks() {
        return Arrays.asList("Java Book", "Spring Book", "Mern Book");
    }
}
