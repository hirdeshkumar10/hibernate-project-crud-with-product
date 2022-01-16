package com.sunglowsys.test;

import com.sunglowsys.repository.ProductRepositoryImpl;

public class FindProductByIdTest {
    public static void main(String[] args) {
        System.out.println(new ProductRepositoryImpl().findById(3L));
    }
}
