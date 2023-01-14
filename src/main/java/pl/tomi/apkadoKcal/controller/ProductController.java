package pl.tomi.apkadoKcal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomi.apkadoKcal.dto.ProductDTO;
import pl.tomi.apkadoKcal.entity.Product;
import pl.tomi.apkadoKcal.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getProduct() {
        return productService.getAllProducts();
    }


    @PostMapping("/products")
    public void saveProduct(@RequestBody ProductDTO product) {
        productService.saveProduct(product);
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductbyId(id);
    }

    @DeleteMapping("products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }


}
