package com.lt.ecommerce.controller;

import com.lt.ecommerce.services.UserService;
import com.lt.ecommerce.utils.UserInput;

import java.util.Scanner;

public class DeliveryAgentController {
    private static final Scanner scanner = new Scanner(System.in);
    public void run() {
        int option = 0;
        do {
            System.out.println("---Choose user operation---");
            System.out.println("1 Create delivery agent");
            System.out.println("2 Get delivery agent");
            System.out.println("3 Display all delivery agents");
            System.out.println("4 Remove delivery agent");
            System.out.println("5 Remove all delivery agents");
            System.out.println("---------------------------");
            System.out.println("9 Go to main menu");
            option = Integer.parseInt(scanner.nextLine());

            UserService userService = new UserService(UserInput.DELIVERY_AGENT.value);
            switch (option) {
                case 1: {
                    userService.createUser();
                    break;
                }
                case 2: {
                    System.out.println("Enter delivery agent id: ");
                    int userId = Integer.parseInt(scanner.nextLine());
                    userService.getUser(userId);
                    break;
                }
                case 3: {
                    userService.displayAllUsers();
                    break;
                }
                case 4: {
                    System.out.println("Enter delivery agent id to remove: ");
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
