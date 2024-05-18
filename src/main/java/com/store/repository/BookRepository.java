package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
