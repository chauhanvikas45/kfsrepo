package com.test;

import com.test.dto.ProductDto;
import com.test.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class sample {
    public static void main(String[] args) {
        SpringApplication.run(sample.class,args);
    }


}
