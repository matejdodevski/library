package com.Lab2.library.service;

import com.Lab2.library.model.Author;
import com.Lab2.library.model.Book;
import com.Lab2.library.model.BookCategory;
import com.Lab2.library.model.Country;
import com.Lab2.library.repository.interfaces.IAuthorRepository;
import com.Lab2.library.repository.interfaces.IBookCategoryRepository;
import com.Lab2.library.repository.interfaces.IBookRepository;
import com.Lab2.library.repository.interfaces.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    IBookCategoryRepository bookCategoryRepository;
    @Autowired
    IBookRepository bookRepository;
    @Autowired
    IAuthorRepository authorRepository;
    @Autowired
    ICountryRepository countryRepository;

    public List<BookCategory> getAllCategories() {
        return bookCategoryRepository.findAll();
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Optional<Book> getBook(String id){
        return bookRepository.findById(Long.valueOf(id));
    }


    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country addCountry(Country country){
        return countryRepository.save(country);
    }
}
