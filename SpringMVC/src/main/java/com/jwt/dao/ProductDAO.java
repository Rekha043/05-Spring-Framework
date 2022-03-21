package com.jwt.dao;

import java.util.List;

import com.jwt.model.Product;
 
public interface ProductDAO {
 
    public void addProduct(Product product);
 
    public List<Product> getAllProduct();
 
    public void deleteProduct(Integer productId);
 
    public Product updateProduct(Product product);
 
    public Product getProduct(int productid);
}