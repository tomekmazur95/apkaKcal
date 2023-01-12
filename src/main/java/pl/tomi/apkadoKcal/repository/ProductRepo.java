package pl.tomi.apkadoKcal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomi.apkadoKcal.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {


}
