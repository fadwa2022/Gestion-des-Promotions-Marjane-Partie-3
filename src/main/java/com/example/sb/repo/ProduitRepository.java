package com.example.sb.repo;

import com.example.sb.model.Entities.Categories;
import com.example.sb.model.Entities.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produits,Long> {
}
