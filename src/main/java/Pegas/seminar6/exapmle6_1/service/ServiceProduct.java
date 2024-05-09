package Pegas.seminar6.exapmle6_1.service;

import Pegas.seminar6.exapmle6_1.entity.Product;

import java.util.List;

public interface ServiceProduct {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    boolean deleteProduct(Long id);
    Product createProduct(Product p);
    Product updateProduct(Long id, Product p);

}
