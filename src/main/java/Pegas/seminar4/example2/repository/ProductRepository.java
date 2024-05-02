package Pegas.seminar4.example2.repository;

import Pegas.seminar4.example2.enity.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class ProductRepository {
    List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }
}
