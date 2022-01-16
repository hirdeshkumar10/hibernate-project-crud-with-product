package com.sunglowsys.repository;

import com.sunglowsys.domain.Product;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


    @Override
    public Product save(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id =(Long) session.save(product);
        session.getTransaction().commit();
        Product result = session.get(Product.class,id);
        return result;
    }

    @Override
    public Product update(Product product ,Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product1 = session.get(Product.class,id);
        product1.setProductName(product.getProductName());
        session.update(product1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Updated.................");
        return product1;
    }

    @Override
    public Product findById(Long id) {
        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class,id);
        return product;
    }

    @Override
    public List<Product> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query queue = session.createQuery("from Product");
        List<Product> productList = queue.list();
        return productList;
    }

    @Override
    public Product delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = session.get(Product.class,id);
        session.delete(product);
        session.getTransaction().commit();
        session.close();
        System.out.println("deleted.............");
        return product;

    }
}
