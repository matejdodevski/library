package com.Lab2.library.repository.interfaces;

import com.Lab2.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAuthorRepository extends JpaRepository<Author,Long> {

    List<Author> findAll();

}

