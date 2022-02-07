package app.services;

import app.models.Product;
import app.repositories.ProductRepository;
import app.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Optional<Product>> productsByShopId(Product product) {
        List<Optional<Product>> row = productRepository.findProductsByShopId(product.getShopId());
        if (!row.isEmpty()) {
            return row;
        } else throw new RestApiException("Shop is not found!");
    }
}
