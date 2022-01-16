package com.sunglowsys.test;

import com.sunglowsys.domain.Product;
import com.sunglowsys.service.ProductServiceImpl;

import java.util.List;

public class FindAllProductTest {
    public static void main(String[] args) {
        List<Product> product1 = new ProductServiceImpl() .findAll();
        for (Product product : product1){
            System.out.println(product);
        }
    }
}
