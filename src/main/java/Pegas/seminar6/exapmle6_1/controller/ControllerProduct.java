package Pegas.seminar6.exapmle6_1.controller;

import Pegas.seminar6.exapmle6_1.entity.Product;
import Pegas.seminar6.exapmle6_1.service.ServiceProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Проверка свагером http://localhost:8080/swagger-ui/index.html

@RestController
@RequestMapping("/productss")
@RequiredArgsConstructor
public class ControllerProduct {

        private final ServiceProduct serviceProduct;

        @GetMapping
        public ResponseEntity<List<Product>> getAll() {
            return new ResponseEntity<>(serviceProduct.getAllProducts(), HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<Product> createProduct(@RequestBody Product product) {
            return new ResponseEntity<>(serviceProduct.createProduct(product), HttpStatus.CREATED);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
            Product productById;
            try {
                productById = serviceProduct.getProductById(id);
            } catch (RuntimeException e){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Product());
            }
            return new ResponseEntity<>(productById, HttpStatus.OK);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
            return new ResponseEntity<>(serviceProduct.updateProduct(id,product), HttpStatus.OK);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id){
            serviceProduct.deleteProduct(id);
            return ResponseEntity.ok().build();
        }
}
