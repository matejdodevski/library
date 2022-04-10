package com.Lab2.library.repository.interfaces;

import com.Lab2.library.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookCategoryRepository extends JpaRepository<BookCategory,Long> {

    List<BookCategory> findAll();
}

