package com.sunglowsys.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.service.ProductServiceImpl;

public class UpdateProductTest {
    public static void main(String[] args) {
        Product product = new Product();
       product.setProductName("bike");
       new ProductServiceImpl().update(product,3L);
    }
}
