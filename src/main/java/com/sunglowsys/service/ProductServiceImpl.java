package com.sunglowsys.service;

import com.sunglowsys.domain.Product;
import com.sunglowsys.repository.ProductRepository;
import com.sunglowsys.repository.ProductRepositoryImpl;

import java.util.List;

public  class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product, Long id) {
        return productRepository.update(product,id);
    }


    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);

    }
}
