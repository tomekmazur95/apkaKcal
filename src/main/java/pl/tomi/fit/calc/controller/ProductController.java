package pl.tomi.fit.calc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.tomi.fit.calc.dto.CreateProduct;
import pl.tomi.fit.calc.dto.ViewProduct;
import pl.tomi.fit.calc.entity.Product;
import pl.tomi.fit.calc.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<ViewProduct> getProduct() {
        return productService.getAllProducts();
    }

    @PostMapping()
    public ResponseEntity<Void> saveProduct(@RequestBody CreateProduct product) {
        productService.saveProduct(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("/{id}")
    public Optional<ViewProduct> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

}
