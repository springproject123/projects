package com.example.goodreads.repository;

import com.example.goodreads.model.Book;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {
   

}