package com.example.jewelicious.controller;

import com.example.jewelicious.dto.ProductDto;
import com.example.jewelicious.entity.Product;
import com.example.jewelicious.repository.ProductRepository;
import com.example.jewelicious.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {

    private final IProductService iProductService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() throws InterruptedException { // DTO Pattern
        List<ProductDto> productList = iProductService.getProducts();
        return ResponseEntity.ok().body(productList);
    }
}
