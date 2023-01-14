package pl.tomi.fit.calc.dto;

import pl.tomi.fit.calc.entity.Product;

public record ViewProduct(long id, String name, int protein, int fat, int carb) {

    public static ViewProduct mapper(Product product) {
        return new ViewProduct(product.getId(), product.getName(), product.getProtein(), product.getFat(), product.getCarb());
    }
}
