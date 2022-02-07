package app.models;

import javax.persistence.*;

@Entity
@Table(name = "product", catalog = "", schema = "public")
@SequenceGenerator(name = "product_product_id_seq", sequenceName = "product_product_id_seq", allocationSize = 1)

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_product_id_seq")
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_name")
    private String productName;
    private int price;
    private int amount;
    @Column(unique = true, name = "product_key")
    private int productKey;
    @Column(name = "shop_id")
    private int shopId;

    public Product() {
    }

    public Product(int product_id, String productName, int price, int amount, int productKey, int shopId) {
        this.productId = product_id;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.productKey = productKey;
        this.shopId = shopId;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String product_name) {
        this.productName = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProductKey() {
        return productKey;
    }

    public void setProductKey(int product_key) {
        this.productKey = product_key;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int fkShopId) {
        this.shopId = fkShopId;
    }
}

