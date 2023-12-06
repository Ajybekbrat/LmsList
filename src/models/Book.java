package models;

import impl.ServiceBook;

import java.util.ArrayList;

public class Book {
    public String id;
    private String name;
    private String author;
    private String Genre;

    public Book() {
    }


    public Book(String id, String name, String author, String genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        Genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }


}