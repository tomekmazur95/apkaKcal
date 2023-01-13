package pl.tomi.apkadoKcal.dto;

import pl.tomi.apkadoKcal.entity.Product;

import java.io.Serializable;
import java.util.List;

public class ProductDTO implements Serializable {
    private String name;
    private int protein;
    private int fat;
    private int carb;

    public ProductDTO(String name, int protein, int fat, int carb) {
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carb = carb;
    }

    public static ProductDTO fromEntityToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO(product.getName(), product.getProtein(), product.getFat(), product.getCarb());
        return productDTO;
    }

    public static List<ProductDTO> fromEntityListToDTO(List<Product> productList) {
        return null;
    }


    public String getName() {
        return name;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getCarb() {
        return carb;
    }
}
