package com.Lab2.library.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Name;
    private String Continent;


    public Country(String name, String continent) {
        this.Name = name;
        this.Continent = continent;
    }

    public Country() {

    }
}