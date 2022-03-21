package com.jwt.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ProductDAO;
import com.jwt.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
 
    @Autowired
    private ProductDAO productDAO;
 
    @Transactional
    public void addEmployee(Product product) {
    	productDAO.addProduct(product);
    }
 
    @Transactional
    public List<Product> getAllProduct() {
        return productDAO.getAllProduct();
    }
 
    @Transactional
    public void deleteProduct(Integer productId) {
    	productDAO.deleteProduct(productId);
    }
 
    public Product getProduct(int pid) {
        return productDAO.getProduct(pid);
    }
 
    public Product updateProduct(Product product) {
        // TODO Auto-generated method stub
        return productDAO.updateProduct(product);
    }
 
    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}
 
}
