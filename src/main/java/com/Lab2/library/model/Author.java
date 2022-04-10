package com.Lab2.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Name;

    private String Surname;

    private Long CountryId;

    public Author(String name, String surname, Long countryId) {
        this.Name = name;
        this.Surname = surname;
        this.CountryId = countryId;
    }

    public Author() {

    }
}