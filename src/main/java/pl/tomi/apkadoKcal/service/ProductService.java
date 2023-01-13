package pl.tomi.apkadoKcal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomi.apkadoKcal.dto.ProductDTO;
import pl.tomi.apkadoKcal.entity.Product;
import pl.tomi.apkadoKcal.repository.ProductRepo;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;

        Product product1 = new Product();
        product1.setName("mielone");
        product1.setCarb(0);
        product1.setFat(50);
        product1.setProtein(100);
        productRepo.save(product1);

    }

    public List<Product> getAllProducts() {

        List<Product> allProducts = productRepo.findAll();

        return allProducts;

    }

    public void saveProduct(ProductDTO product) {

        Product productDTO = Product.of(product);

        productRepo.save(productDTO);
    }

    public Optional<Product> getProductbyId(Long id) {

        Optional<Product> foundbyId = productRepo.findById(id);

        return foundbyId;
    }

    public void deleteProductById(Long id) {

        productRepo.deleteById(id);

    }


}
