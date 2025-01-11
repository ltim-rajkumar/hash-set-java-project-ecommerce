package com.lt.ecommerce.controller;

import com.lt.ecommerce.services.UserService;
import com.lt.ecommerce.utils.UserInput;

import java.util.Scanner;

public class SellerController {
    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        int option;
        do {
            System.out.println("---Choose seller option---");
            System.out.println("1 Create seller");
            System.out.println("2 Get seller");
            System.out.println("3 Display all sellers");
            System.out.println("4 Remove seller");
            System.out.println("5 Remove all sellers");
            System.out.println("---------------------------");
            System.out.println("9 Go to main menu");
            option = Integer.parseInt(scanner.nextLine());

            UserService userService = new UserService(UserInput.SELLER.value);
            switch (option) {
                case 1: {
                    userService.createUser();
                    break;
                }
                case 2: {
                    System.out.println("Enter seller id: ");
                    int userId = Integer.parseInt(scanner.nextLine());
                    userService.getUser(userId);
                    break;
                }
                case 3: {
                    userService.displayAllUsers();
                    break;
                }
                case 4: {
                    System.out.println("Enter seller id to remove: ");
                    int userId = Integer.parseInt(scanner.nextLine());
                    userService.removeUser(userId);
                    break;
                }
                case 5: {
                    userService.removeAllUsers();
                    break;
                }
            }
        }while (option != 9);
    }
}
