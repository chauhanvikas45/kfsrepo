package com.test.services;

import com.test.dto.ProductDto;
import com.test.entity.Product;

import java.util.List;

public interface ProductService {

    void addProduct(ProductDto productDto);
    ProductDto getProductDetails(ProductDto productDto);
    List<Product> getProductList();

    List<String> getProductListForSpecificCustomer(String customerName);
}
