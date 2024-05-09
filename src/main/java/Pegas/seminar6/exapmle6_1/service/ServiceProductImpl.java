package Pegas.seminar6.exapmle6_1.service;

import Pegas.seminar6.exapmle6_1.entity.Product;
import Pegas.seminar6.exapmle6_1.repository.RepositoryProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceProductImpl implements ServiceProduct{

    private final RepositoryProduct repositoryProduct;

    @Override
    public List<Product> getAllProducts() {
        return repositoryProduct.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return repositoryProduct.findById(id).orElse(null);
    }

    @Override
    public boolean deleteProduct(Long id) {
        Product product = getProductById(id);
        if(product!=null) {
            repositoryProduct.delete(product);
            return true;
        }else{return false;}
    }

    @Override
    public Product createProduct(Product p) {
        return repositoryProduct.saveAndFlush(p);
    }

    @Override
    public Product updateProduct(Long id, Product p) {
        Product product = getProductById(id);
        product.setName(p.getName());
        product.setQuantity(p.getQuantity());
        return repositoryProduct.saveAndFlush(product);
    }
}
