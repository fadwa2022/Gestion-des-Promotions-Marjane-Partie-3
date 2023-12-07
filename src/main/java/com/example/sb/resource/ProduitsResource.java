package com.example.sb.resource;

import com.example.sb.model.dto.CategoriesDto;
import com.example.sb.model.dto.ProduitsDto;
import com.example.sb.service.CategoriesManagerApplication;
import com.example.sb.service.ProduitManagerApplication;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping(path = "api/produits")
@CrossOrigin(origins = "*")

public class ProduitsResource extends  Resource<ProduitsDto, ProduitsDto,Long>{
    @Autowired
    public void setService(
            ProduitManagerApplication service) {
        this.service = service;
    }

}