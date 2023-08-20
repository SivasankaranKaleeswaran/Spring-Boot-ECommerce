package com.EcommerceProject.product_service.Service;

import com.EcommerceProject.product_service.Entity.Product;
import com.EcommerceProject.product_service.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public ResponseEntity<List<Product>> getAllProduct() {

        return ResponseEntity.status(HttpStatus.OK).body(productRepo.findAll());
    }

    public ResponseEntity<List<Product>> addNewProduct(Product product) {

        return ResponseEntity.status(HttpStatus.CREATED).body(productRepo.saveAll(List.of(product)));
    }
}
