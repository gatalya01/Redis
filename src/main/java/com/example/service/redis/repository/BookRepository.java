package com.example.service.redis.repository;


import com.example.service.redis.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByCategoryCategoryName(String categoryName);
    Optional<Book> findByAuthorAndName(String author, String name);
    boolean existsByAuthorAndName(String author, String name);
}