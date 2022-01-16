package com.sunglowsys.service;

import com.sunglowsys.domain.Product;

import java.util.List;

public interface ProductService {

    Product save(Product product);

    Product update(Product product, Long id);

    Product findById(Long id);

    List<Product> findAll();

    void delete(Long id);
}
