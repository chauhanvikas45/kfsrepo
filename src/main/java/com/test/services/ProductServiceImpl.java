package com.test.services;

import com.test.dto.ProductDto;
import com.test.entity.Product;
import com.test.mapper.ProductMapper;
import com.test.repository.CustomerRepository;
import com.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void addProduct(final ProductDto productDto) {
         productRepository.save(ProductMapper.mapDtoToEntity(productDto));
    }

    @Override
    public ProductDto getProductDetails(ProductDto productDto1) {
        Product product = productRepository.findProductByProductName(productDto1.getProductName()).get(0);
        return ProductMapper.mapEntityToDto(product);
    }

    @Override
    public List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productDto -> productList.add(productDto));

        return productList;
    }

    @Override
    public List<String> getProductListForSpecificCustomer(String customerName) {
        //TODO select product for specific customer
        List<Product> productList = new ArrayList<>();
        //productRepository.findProductByCustomerProduct(customerRepository.getCustomerByCustomerName(customerName).get(0)).forEach(productDto -> productList.add(productDto));

        List<String> productNameList = new ArrayList<>();
        for (Product product : productList
        ) {
            productNameList.add(product.getProductName());

        }
        return productNameList;
    }

    public static String saveImage(final MultipartFile file, Product product) {

        String filename = ("C:\\Users\\vikas.chauhan\\Documents\\personal\\" + product.getProductName() + file.getOriginalFilename());
        //filename = filename.replace(" ","");
        try {

            byte barr[] = file.getBytes();

            BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream(new File(filename)));
            bout.write(barr);
            bout.flush();
            bout.close();


        } catch (Exception e) {
            System.out.println("Exception occured :" + e.getMessage());
            filename = null;
        }
        System.out.println("Images were written succesfully.");
        return filename;
    }
}
