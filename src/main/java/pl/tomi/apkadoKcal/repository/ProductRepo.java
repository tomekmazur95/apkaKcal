package pl.tomi.apkadoKcal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tomi.apkadoKcal.entity.Product;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long id);

    @Override
    void deleteById(Long id);
}
