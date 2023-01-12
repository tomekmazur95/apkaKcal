package pl.tomi.apkadoKcal.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.tomi.apkadoKcal.entity.Product;
import pl.tomi.apkadoKcal.service.ProductService;

import java.util.List;

@RestController
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }


    @PostMapping("/products")
    public void saveP(@RequestBody Product product){
        productService.saveProduct(product);

    }





}
