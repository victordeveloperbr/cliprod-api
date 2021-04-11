package com.exinfo.testedeconhecimento.resources;

import com.exinfo.testedeconhecimento.domain.Product;
import com.exinfo.testedeconhecimento.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductResource {
    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProduct()
    {
        List<Product> products = this.productService.getAllProduct();
        return products;
    }
    @PostMapping
    public Product saveIntoProduct(@RequestBody Product product)
    {
        this.productService.save(product);
        return product;
    }
}
