package app.services;

import app.models.Sell;
import app.repositories.SellRepository;
import app.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellService {

    private final SellRepository sellRepository;

    public SellService(SellRepository sellRepository) {
        this.sellRepository = sellRepository;
    }

    public List<Optional<Sell>> soldByShopId(Sell sell) {
        List<Optional<Sell>> row = sellRepository.findSoldByShopId(sell.getShopId());
        if (!row.isEmpty()) {
            return row;
        } else throw new RestApiException("Shop is not found!");
    }

    public boolean add(Sell sell) {
        boolean success;
        try {
            sellRepository.save(sell);
            success = true;
        } catch (Exception ex) {
            success = false;
            System.out.println("sell is not added");
        }
        return success;
    }
}
