package com.lt.ecommerce.controller;

import com.lt.ecommerce.services.ShopService;
import com.lt.ecommerce.services.UserService;
import com.lt.ecommerce.utils.UserInput;

import java.util.Scanner;

public class ShopController {
    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        int option;
        do {
            System.out.println("---Choose shop option---");
            System.out.println("1 Create shop");
            System.out.println("2 Get shop");
            System.out.println("3 Display all shops");
            System.out.println("4 Remove shop");
            System.out.println("5 Remove all shops");
            System.out.println("---------------------------");
            System.out.println("9 Go to main menu");
            option = Integer.parseInt(scanner.nextLine());

            ShopService shopService = new ShopService();
            switch (option) {
                case 1: {
                    shopService.createShop();
                    break;
                }
                case 2: {
                    System.out.println("Enter shop id: ");
                    shopService.getShop(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                case 3: {
                    shopService.displayAllShops();
                    break;
                }
                case 4: {
                    System.out.println("Enter shop id to remove: ");
                    shopService.removeShop(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                case 5: {
                    shopService.removeAllShops();
                    break;
                }
            }
        }while (option != 9);
    }
}
