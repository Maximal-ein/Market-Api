package app.controllers;

import app.models.Sell;
import app.services.SellService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("v1/sell")
public class SellController {

    private final SellService sellService;

    public SellController(SellService sellService) {
        this.sellService = sellService;
    }

    @GetMapping(path = "soldByShopId")
    public List<Optional<Sell>> soldByShopId(@RequestBody Sell sell) {
        return sellService.soldByShopId(sell);
    }

    @PostMapping(path = "newSell")
    public Map<String, Boolean> add(@RequestBody Sell sell) {
        boolean bool = sellService.add(sell);
        return new HashMap<>() {{
            put("result", bool);
        }};
    }
}
