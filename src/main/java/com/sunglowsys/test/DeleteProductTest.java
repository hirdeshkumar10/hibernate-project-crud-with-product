package com.sunglowsys.test;

import com.sunglowsys.repository.ProductRepositoryImpl;

public class DeleteProductTest {
    public static void main(String[] args) {
        System.out.println(new ProductRepositoryImpl().delete(1L));
    }
}
