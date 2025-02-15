package com.lt.ecommerce.repository;

import com.lt.ecommerce.model.Shop;
import java.util.HashMap;
import java.util.Map;

public class ShopRepository {
    private static final Map<Integer, Shop> shopMap = new HashMap<Integer, Shop>();

    public void addShop(Shop shop) {
        shopMap.put(shop.getId(), shop);
    }

    public Shop getShop(int shopId) {
        return shopMap.get(shopId);
    }

    public Shop removeShop(int shopId) {
        return shopMap.remove(shopId);
    }

    public Map<Integer, Shop> getAllShops() {
        return shopMap;
    }

    public void removeAllShops() {
        shopMap.clear();
    }
    public int getShopsSize() {
        return shopMap.size();
    }

    public boolean containsShop(int shopId) {
        return shopMap.containsKey(shopId);
    }

}
