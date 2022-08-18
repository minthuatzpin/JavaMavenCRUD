package com.example.rest.Controller;

import com.example.rest.Models.Product;
import com.example.rest.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductRepo productRepo;

    @PostMapping(value = "/product/save")
    public String saveProduct(@RequestBody Product product){
        productRepo.save(product);
        return "saved";
    }
}
