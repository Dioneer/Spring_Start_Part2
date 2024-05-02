package Pegas.seminar4.example2.controller;

import Pegas.seminar4.example2.enity.Product;
import Pegas.seminar4.example2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/products")
    public String getProduct(Model model){
        productRepository.addProduct(new Product("Array", 123));
        model.addAttribute("products",productRepository.getProductList());
        return "products";
    }
    @PostMapping("/products")
    public String getProduct(Model model, Product product){
        productRepository.addProduct(product);
        model.addAttribute("products",productRepository.getProductList());
        return "products";
    }
}
