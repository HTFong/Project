package com.example.onetomany.Repositorys;

import com.example.onetomany.Domains.Book;
import com.example.onetomany.Domains.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PageRepository extends CrudRepository<Page, Long> {

    List<Page> findByBook(Book book, Sort sort);
}