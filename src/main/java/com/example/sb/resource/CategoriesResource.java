package com.example.sb.resource;

import com.example.sb.model.dto.CategoriesDto;
import com.example.sb.model.dto.ClientDto;
import com.example.sb.model.dto.ClientDtoRequest;
import com.example.sb.service.CategoriesManagerApplication;
import com.example.sb.service.Impl.ClientManagerApplicationImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping(path = "api/categories")
@CrossOrigin(origins = "*")

public class CategoriesResource extends  Resource<CategoriesDto, CategoriesDto,Long>{
    @Autowired
    public void setService(
            CategoriesManagerApplication service) {
        this.service = service;
    }

}