package pl.tomi.fit.calc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomi.fit.calc.dto.CreateProduct;
import pl.tomi.fit.calc.dto.ViewProduct;
import pl.tomi.fit.calc.entity.Product;
import pl.tomi.fit.calc.repository.ProductRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<ViewProduct> getAllProducts() {
        return productRepo.findAll().stream()
                .map(ViewProduct::mapper)
                .toList();
    }

    public void saveProduct(CreateProduct product) {

        Product productDTO = Product.of(product);
        productRepo.save(productDTO);
    }

    public Optional<ViewProduct> getProductById(Long id) {
        return productRepo.findById(id).map(ViewProduct::mapper);
    }

    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }

}
