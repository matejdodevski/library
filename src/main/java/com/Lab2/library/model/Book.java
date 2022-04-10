package com.Lab2.library.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Name;

    private Long AuthorId;

    private Long CategoryId;

    private Integer AvailableCopies;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AuthorId", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Author Author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryId", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private BookCategory Category;

    public Book(String name, long authorId, int availableCopies, long categoryId) {
        this.Name = name;
        this.AuthorId = authorId;
        this.AvailableCopies = availableCopies;
        this.CategoryId = categoryId;
    }

    public Book() {

    }
}