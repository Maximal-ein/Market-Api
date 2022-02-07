package app.models;

import javax.persistence.*;

@Entity
@Table(name = "sell", catalog = "", schema = "public")
@SequenceGenerator(name = "sell_sell_id_seq", sequenceName = "sell_sell_id_seq", allocationSize = 1)

public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sell_sell_id_seq")
    @Column(name = "sell_id")
    private int sellId;
    @Column(name = "shop_id")
    private int shopId;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "amount_sold")
    private int amountSold;

    public Sell() {
    }

    public Sell(int sell_id, int shopId, int product_id, int customer_id, int amount_sold) {
        this.sellId = sell_id;
        this.shopId = shopId;
        this.productId = product_id;
        this.customerId = customer_id;
        this.amountSold = amount_sold;
    }

    public int getSellId() {
        return sellId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int product_id) {
        this.productId = product_id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customer_id) {
        this.customerId = customer_id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amount_sold) {
        this.amountSold = amount_sold;
    }
}
