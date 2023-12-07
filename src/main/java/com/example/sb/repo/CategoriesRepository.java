package com.example.sb.repo;

import com.example.sb.model.Entities.Categories;
import com.example.sb.model.Entities.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Long> {
}

