package com.Lab2.library;

import com.Lab2.library.model.Author;
import com.Lab2.library.model.Book;
import com.Lab2.library.model.BookCategory;
import com.Lab2.library.model.Country;
import com.Lab2.library.repository.interfaces.IAuthorRepository;
import com.Lab2.library.repository.interfaces.IBookCategoryRepository;
import com.Lab2.library.repository.interfaces.IBookRepository;
import com.Lab2.library.repository.interfaces.ICountryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		var configurableApplicationContext = SpringApplication.run(LibraryApplication.class, args);

		var bookCategoryRepository = configurableApplicationContext.getBean(IBookCategoryRepository.class);
		var bookCategory = new BookCategory("DRAMA");
		bookCategoryRepository.save(bookCategory);
		bookCategory = new BookCategory("NOVEL");
		bookCategoryRepository.save(bookCategory);
		bookCategory = new BookCategory("THRILER");
		bookCategoryRepository.save(bookCategory);
		bookCategory = new BookCategory("HISTORY");
		bookCategoryRepository.save(bookCategory);
		bookCategory = new BookCategory("FANTASY");
		bookCategoryRepository.save(bookCategory);
		bookCategory = new BookCategory("BIOGRAPHY");
		bookCategoryRepository.save(bookCategory);
		bookCategory = new BookCategory("CLASSICS");
		bookCategoryRepository.save(bookCategory);

		var countryRepository = configurableApplicationContext.getBean(ICountryRepository.class);
		var country = new Country("Macedonia","Europe");
		countryRepository.save(country);
		country = new Country("Greece","Europe");
		countryRepository.save(country);
		country = new Country("Serbia","Europe");
		countryRepository.save(country);
		country = new Country("Albania","Europe");
		countryRepository.save(country);
		country = new Country("Kosovo","Europe");
		countryRepository.save(country);
		country = new Country("Bulgaria","Europe");
		countryRepository.save(country);
		country = new Country("Croatia","Europe");
		countryRepository.save(country);
		country = new Country("Bosnia and Herzegovina","Europe");
		countryRepository.save(country);
		country = new Country("Montenegro","Europe");
		countryRepository.save(country);
		country = new Country("Germany","Europe");
		countryRepository.save(country);
		country = new Country("Russia","Europe");
		countryRepository.save(country);
		country = new Country("France","Europe");
		countryRepository.save(country);
		country = new Country("Italy","Europe");
		countryRepository.save(country);
		country = new Country("The United Kingdom","Europe");
		countryRepository.save(country);
		country = new Country("Ireland","Europe");
		countryRepository.save(country);
		country = new Country("Spain","Europe");
		countryRepository.save(country);
		country = new Country("Portugal","Europe");
		countryRepository.save(country);
		country = new Country("Ukraine","Europe");
		countryRepository.save(country);
		country = new Country("Belgium","Europe");
		countryRepository.save(country);
		country = new Country("Turkey","Europe");
		countryRepository.save(country);
		country = new Country("China","Asia");
		countryRepository.save(country);
		country = new Country("South Korea","Asia");
		countryRepository.save(country);
		country = new Country("The United States of America","North America");
		countryRepository.save(country);
		country = new Country("Brazil","South America");
		countryRepository.save(country);
		country = new Country("Argentina","South America");
		countryRepository.save(country);

		var authorRepository = configurableApplicationContext.getBean(IAuthorRepository.class);

		var author = new Author("Slavko", "Janevski", 1L);
		authorRepository.save(author);
		author = new Author("Marcel", "Proust", 12L);
		authorRepository.save(author);

		var bookRepository = configurableApplicationContext.getBean(IBookRepository.class);
		var book = new Book("Dve Marii", 1L, 25, 2L);
		bookRepository.save(book);
		book = new Book("In Search of Lost Time", 2L, 100, 1L);
		bookRepository.save(book);

	}

}
