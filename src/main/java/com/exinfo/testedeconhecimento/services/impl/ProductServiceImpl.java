package com.exinfo.testedeconhecimento.services.impl;

import com.exinfo.testedeconhecimento.domain.Product;
import com.exinfo.testedeconhecimento.repositories.ProductRepository;
import com.exinfo.testedeconhecimento.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }
}
