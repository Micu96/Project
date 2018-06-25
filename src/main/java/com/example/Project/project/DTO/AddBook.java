package com.example.Project.project.DTO;

import com.example.Project.project.Library;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddBook {

    private Long id;
    private String name;
    private String author;

    public AddBook() {
    }

    public AddBook(Long id,String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public AddBook(Library library){

        this.name = library.getName();
        this.author = library.getAuthor();
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

    public void validate(){

        if(name == null || name.length() == 0){
            throw new RuntimeException("Book title is required");
        }
        if(author == null || author.length() == 0){
            throw new RuntimeException("Book author is required");
        }


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
