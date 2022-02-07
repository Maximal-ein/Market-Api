package app.models;

import javax.persistence.*;

@Entity
@Table(name = "shop", catalog = "", schema = "public")
@SequenceGenerator(name = "shop_shop_id_seq", sequenceName = "shop_shop_id_seq", allocationSize = 1)

public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shop_shop_id_seq")
    @Column(name = "shop_id")
    private int shopId;
    @Column(unique = true, name = "shop_name")
    private String shopName;
    private String address;

    public Shop() {
    }

    public Shop(int shop_id, String shop_name, String address) {
        this.shopId = shop_id;
        this.shopName = shop_name;
        this.address = address;
    }

    public int getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shop_name) {
        this.shopName = shop_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

