package com.lt.ecommerce.services;
import com.lt.ecommerce.models.Shop;
import com.lt.ecommerce.repository.ShopRepository;

import java.util.Scanner;

public class ShopService {
    static final Scanner scanner = new Scanner(System.in);
    private static final ShopRepository shopRepository = new ShopRepository();

    public void createShop() {
        Shop shop = new Shop();
        System.out.println("Enter shop id:");
        shop.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter owner id:");
        shop.setOwnerId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter shop name:");
        shop.setName(scanner.nextLine());

        System.out.println("Enter shop address:");
        shop.setAddress(scanner.nextLine());

        System.out.println("Enter shop contact number:");
        shop.setContactNo(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter shop licence number:");
        shop.setName(scanner.nextLine());

        System.out.println("shop = " + shop);
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
