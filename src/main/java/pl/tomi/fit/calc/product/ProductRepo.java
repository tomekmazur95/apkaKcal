package pl.tomi.fit.calc.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long id);

    @Override
    void deleteById(Long id);
}
