package com.example.sb.service;

import org.springframework.data.domain.Page;

public interface PaginationService <Dto,DtoRequest,Identifier>  {
    Page<Dto> getAllPages(int page,int size);
}
