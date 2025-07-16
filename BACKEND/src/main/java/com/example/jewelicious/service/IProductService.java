package com.example.jewelicious.service;

import com.example.jewelicious.dto.ProductDto;
import com.example.jewelicious.entity.Product;

import java.util.List;

public interface IProductService {

    List<ProductDto> getProducts();
}
