package com.example.service.redis.repository;

import com.example.service.redis.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByCategoryName(String categoryName);
}
