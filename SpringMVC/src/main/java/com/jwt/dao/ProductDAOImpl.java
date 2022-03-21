package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Product;
 

 
@Repository
public class ProductDAOImpl implements ProductDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addProduct(Product product) {
        sessionFactory.getCurrentSession().saveOrUpdate(product);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Product> getAllProduct() {
 
        return sessionFactory.getCurrentSession().createQuery("from Product")
                .list();
    }
 
    public void deleteProduct(Integer productId) {
    	Product product = (Product) sessionFactory.getCurrentSession().load(
    			Product.class, productId);
        if (null != product) {
            this.sessionFactory.getCurrentSession().delete(product);
        }
 
    }
 
    public Product getProduct(int pid) {
        return (Product) sessionFactory.getCurrentSession().get(
        		Product.class, pid);
    }
 

	public Product updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return null;
	}

}