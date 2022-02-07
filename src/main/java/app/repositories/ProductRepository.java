package app.repositories;

import app.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Optional<Product>> findProductsByShopId(int shopId);
}
