package app.services;

import app.models.Shop;
import app.repositories.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public List<Shop> list() {
        return shopRepository.findAll();
    }
}
