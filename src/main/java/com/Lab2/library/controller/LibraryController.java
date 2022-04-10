package com.Lab2.library.controller;

import com.Lab2.library.model.Author;
import com.Lab2.library.model.Book;
import com.Lab2.library.model.BookCategory;
import com.Lab2.library.model.Country;
import com.Lab2.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LibraryController {
    @Autowired
    LibraryService _libraryService;


    @GetMapping("/categories")
    public List<BookCategory> getAllCategories() {
        return _libraryService.getAllCategories();
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return _libraryService.getAllBooks();
    }

    @GetMapping("/book")
    @ResponseBody
    public Optional<Book> getBook(@RequestParam String id) {
        return _libraryService.getBook(id);
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return _libraryService.addBook(book);
    }

    @PostMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return _libraryService.updateBook(book);
    }

    @PostMapping("/deleteBook")
    public void deleteBook(@RequestBody Book book) {
        _libraryService.deleteBook(book);
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return _libraryService.getAllAuthors();
    }

    @PostMapping("/addAuthor")
    public Author addAuthor(@RequestBody Author author) {
        return _libraryService.addAuthor(author);
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return _libraryService.getAllCountries();
    }

    @PostMapping("/addCountry")
    public Country addCountry(@RequestBody Country country) {
        return _libraryService.addCountry(country);
    }



}