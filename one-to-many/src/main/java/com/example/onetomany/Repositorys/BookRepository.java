package com.example.onetomany.Repositorys;

import com.example.onetomany.Domains.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByIsbn(String isbn);
}