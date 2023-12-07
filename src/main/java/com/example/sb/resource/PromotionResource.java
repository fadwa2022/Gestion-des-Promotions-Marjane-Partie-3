
package com.example.sb.resource;

import com.example.sb.model.Entities.Promotions;
import com.example.sb.model.dto.PromotionRequest;
import com.example.sb.model.dto.PromotionsDto;
import com.example.sb.service.Impl.PromotionManagerApplicationImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/promotions")
@CrossOrigin(origins = "*")

public class PromotionResource extends Resource<PromotionsDto, PromotionRequest,Long>{

@Autowired
    public PromotionResource(PromotionManagerApplicationImpl service) {
        this.service = service;
    }

    @GetMapping("/pages")
    public Page<PromotionsDto> getAllPagination(@RequestParam int page, @RequestParam int size)  {
        return this.service.getAllPages(page, size);
    }


}