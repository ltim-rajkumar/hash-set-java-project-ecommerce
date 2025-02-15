package com.lt.ecommerce.service;
import com.lt.ecommerce.model.Shop;
import com.lt.ecommerce.repository.ShopRepository;

import java.util.Scanner;

public class ShopService {
    static final Scanner scanner = new Scanner(System.in);
    private static final ShopRepository shopRepository = new ShopRepository();

    public void createShop() {
        Shop shop = new Shop();
        shop.setId(4001);
        shop.setOwnerId(2001);
        shop.setName("Flipkart");
        shop.setAddress("Pune");
        shop.setContactNo(923184180);
        shop.setName("Jay");
        System.out.println("shop created = " + shop);
    }

    public void displayAllShops() {
        if(shopRepository.getShopsSize() > 0) {
            shopRepository.getAllShops().forEach((shopId, shop) -> {
                System.out.println("Shop id: " + shopId + " : " + shop);
            });
        } else {
            System.out.println("No shop's found to display!!");
        }
    }

    public void getShop(int shopId) {
        if(shopRepository.containsShop(shopId)) {
            System.out.println("Shop details = " + shopRepository.getShop(shopId));
        } else {
            System.out.println("Shop id: " + shopId + " found to display!!");
        }
    }

    public void removeShop(int shopId) {
        if(shopRepository.containsShop(shopId)) {
            System.out.println("Removed shop details = " + shopRepository.removeShop(shopId));
        } else {
            System.out.println("Shop id: " + shopId + " found to remove!!");
        }
    }

    public void removeAllShops() {
        if(shopRepository.getShopsSize() > 0) {
            shopRepository.removeAllShops();
            System.out.println("Removed all shop's");
        } else {
            System.out.println("No shop's found to remove!!");
        }
    }
}
