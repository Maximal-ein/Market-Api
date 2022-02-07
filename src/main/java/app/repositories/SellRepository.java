package app.repositories;

import app.models.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SellRepository extends JpaRepository<Sell, Integer> {

    List<Optional<Sell>> findSoldByShopId(int shopId);

}
