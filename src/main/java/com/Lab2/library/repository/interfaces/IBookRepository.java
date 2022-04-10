package com.Lab2.library.repository.interfaces;

import com.Lab2.library.model.Book;
import com.Lab2.library.model.response.GetAllBooksResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {
//    List<GetAllBooksResponse> getAllBooksWithData();

}