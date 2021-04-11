package com.exinfo.testedeconhecimento.services;

import com.exinfo.testedeconhecimento.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    void save(Product product);
}
