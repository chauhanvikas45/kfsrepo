package com.test.mapper;

import com.test.dto.ProductDto;
import com.test.entity.Product;

public class ProductMapper {


    public static Product mapDtoToEntity(final ProductDto productDto){
        Product product = new Product();
        product.setProductDescription(productDto.getProductDescription());
        product.setCgst(productDto.getCgst());
        product.setSgst(productDto.getSgst());
        product.setIgst(productDto.getIgst());
        product.setProductHSNCode(productDto.getProductHSNCode());
        product.setProductImage(productDto.getProductImage());
        product.setProductName(productDto.getProductName());
        product.setProductQuantity(productDto.getProductQuantity());
        product.setProductRate(productDto.getProductRate());
        product.setProductUON(productDto.getProductUON());
        product.setCustomer(productDto.getCustomer());
        return product;
    }

    public static ProductDto mapEntityToDto(final Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductName(product.getProductName());
        productDto.setProductDescription(product.getProductDescription());
        productDto.setProductHSNCode(product.getProductHSNCode());
        productDto.setProductUON(product.getProductUON());
        productDto.setProductQuantity(product.getProductQuantity());
        productDto.setProductRate(product.getProductRate());
        productDto.setCgst(product.getCgst());
        productDto.setSgst(product.getSgst());
        productDto.setIgst(product.getIgst());
        return productDto;
    }
}
