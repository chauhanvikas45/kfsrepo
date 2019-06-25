package com.test.repository;

import com.test.entity.Customer;
import com.test.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {
    List<Product> findProductByProductName(String productName);
    /*List<Product> findProductByCustomerProduct(Customer customer);*/
}
