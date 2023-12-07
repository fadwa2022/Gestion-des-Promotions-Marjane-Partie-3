package com.example.sb.service.Impl;

import com.example.sb.model.Entities.Categories;
import com.example.sb.model.Entities.Produits;
import com.example.sb.model.dto.CategoriesDto;
import com.example.sb.model.dto.ProduitsDto;
import com.example.sb.model.mappers.Mapper;
import com.example.sb.repo.CategoriesRepository;
import com.example.sb.repo.ProduitRepository;
import com.example.sb.service.ProduitManagerApplication;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProduitManagerApplicationImpl implements ProduitManagerApplication {
    private final ProduitRepository repository;
    private final Mapper<Produits, ProduitsDto> mapper;
    public ProduitManagerApplicationImpl(
            ProduitRepository repository,
            @Qualifier("produitsMapper") Mapper<Produits, ProduitsDto> mapper
    ) {
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public ProduitsDto save(ProduitsDto produitsDto) {
        return null;
    }

    @Override
    public List<ProduitsDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::mapTo)
                .collect(Collectors.toList());    }

    @Override
    public ProduitsDto update(Long aLong, ProduitsDto produitsDto) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public ProduitsDto find(Long aLong) {
        return null;
    }

    @Override
    public ProduitsDto partialUpdate(Long aLong, ProduitsDto produitsDto) {
        return null;
    }

    @Override
    public boolean isExist(Long aLong) {
        return false;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Page<ProduitsDto> getAllPages(int page, int size) {
        return null;
    }
}
