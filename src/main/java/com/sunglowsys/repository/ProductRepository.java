package com.sunglowsys.repository;

import com.sunglowsys.domain.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);
    Product update(Product product,Long id);
    Product findById(Long id);
    List<Product> findAll();
    Product delete(Long id);
}
