package com.lt.ecommerce.controller;

import com.lt.ecommerce.services.UserService;
import com.lt.ecommerce.utils.UserInput;

import java.util.Scanner;

public class UserController {
    private final static Scanner scanner = new Scanner(System.in);
    public void run() {
        int option = 0;
        do {
            System.out.println("---Choose user operation---");
            System.out.println("1 Create customer");
            System.out.println("2 Get customer");
            System.out.println("3 Display all customers");
            System.out.println("4 Remove customer");
            System.out.println("5 Remove all customers");
            System.out.println("---------------------------");
            System.out.println("9 Go to main menu");
            option = Integer.parseInt(scanner.nextLine());

            UserService userService = new UserService(UserInput.CUSTOMER.value);
            switch (option) {
                case 1: {
                    userService.createUser();
                    break;
                }
                case 2: {
                    System.out.println("Enter customer id: ");
                    int userId = Integer.parseInt(scanner.nextLine());
                    userService.getUser(userId);
                    break;
                }
                case 3: {
                    userService.displayAllUsers();
                    break;
                }
                case 4: {
                    System.out.println("Enter customer id to remove: ");
                    int userId = Integer.parseInt(scanner.nextLine());
                    userService.removeUser(userId);
                    break;
                }
                case 5: {
                    userService.removeAllUsers();
                    break;
                }
            }
        }while(option != 9);
    }
}
