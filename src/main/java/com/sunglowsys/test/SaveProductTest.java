package com.sunglowsys.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.service.ProductService;
import com.sunglowsys.service.ProductServiceImpl;

public class SaveProductTest {
    public static void main(String[] args) {
        Product product = new Product("Mobile","smartPhone","vivo",15000F);
        new ProductServiceImpl().save(product);
    }
}
