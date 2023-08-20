package com.EcommerceProject.product_service.Controller;

import com.EcommerceProject.product_service.Entity.Product;
import com.EcommerceProject.product_service.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct()
    {
        return productService.getAllProduct();
    }

    @PostMapping
    public ResponseEntity<List<Product>> addNewProduct(@RequestBody Product product)
    {
        return productService.addNewProduct(product);
    }
}
