package com.example.sb.service.Impl;

import com.example.sb.model.Entities.Categories;
import com.example.sb.model.dto.CategoriesDto;
import com.example.sb.model.mappers.Mapper;
import com.example.sb.repo.CategoriesRepository;
import com.example.sb.service.CategoriesManagerApplication;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class CategoriesManagerApplicationImpl implements CategoriesManagerApplication {
    private final CategoriesRepository repository;
    private final Mapper<Categories, CategoriesDto> mapper;
    public CategoriesManagerApplicationImpl(
            CategoriesRepository repository,
            @Qualifier("categoriesMapper") Mapper<Categories, CategoriesDto> mapper
    ) {
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public CategoriesDto save(CategoriesDto categoriesDto) {
        return null;
    }

    @Override
    public List<CategoriesDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::mapTo)
                .collect(Collectors.toList());
    }

    @Override
    public CategoriesDto update(Long aLong, CategoriesDto categoriesDto) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public CategoriesDto find(Long aLong) {
        return null;
    }

    @Override
    public CategoriesDto partialUpdate(Long aLong, CategoriesDto categoriesDto) {
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
    public Page<CategoriesDto> getAllPages(int page, int size) {
        return null;
    }
}
