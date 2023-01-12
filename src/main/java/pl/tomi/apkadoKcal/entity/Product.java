package pl.tomi.apkadoKcal.entity;


import pl.tomi.apkadoKcal.dto.ProductDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private  String name;
    private int protein;
    private int fat;
    private int carb;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public static Product of(ProductDTO productDTO){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setCarb(productDTO.getCarb());
        product.setFat(productDTO.getFat());
        product.setProtein(productDTO.getProtein());

        return product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
