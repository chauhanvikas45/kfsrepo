package com.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.dto.ProductDto;
import com.test.entity.Product;
import com.test.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService=productService;
    }

    @CrossOrigin
    @RequestMapping(path = "/addProduct", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity addProduct(@RequestBody ProductDto productDto){

        productService.addProduct(productDto);

        return new ResponseEntity("Success".toString(), HttpStatus.CREATED);
    }

    @CrossOrigin
    @RequestMapping(path = "/getProductsForCustomer/{customerName}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getProductsForCustomer(@PathVariable String customerName) throws JsonProcessingException {
        List<String> productList = productService.getProductListForSpecificCustomer(customerName);
        System.out.println(productList);

        ObjectMapper objectMapper = new ObjectMapper();
        String list = objectMapper.writeValueAsString(productList);

        return new ResponseEntity(list, HttpStatus.OK);
    }


    @CrossOrigin
    @RequestMapping(path = "/getProductList", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getProductList() throws JsonProcessingException {
        List<Product> productList = productService.getProductList();
        System.out.println(productList);

        ObjectMapper objectMapper = new ObjectMapper();
        String list = objectMapper.writeValueAsString(productList);

        return new ResponseEntity(list, HttpStatus.OK);
    }


    @CrossOrigin
    @RequestMapping(path = "/getProductDetails", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getProductDetails(ProductDto requestedProductDto) throws JsonProcessingException {
        ProductDto productDto = productService.getProductDetails(requestedProductDto);
        System.out.println(productDto.getProductName());
        System.out.println(productDto.getProductDescription());
        return new ResponseEntity(productDto, HttpStatus.OK);
    }





}
