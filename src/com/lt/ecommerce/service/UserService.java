package com.lt.ecommerce.service;
import com.lt.ecommerce.model.User;
import com.lt.ecommerce.repository.UserRepository;

import java.util.Scanner;

public class UserService {
    private final int userType;
    private final Scanner scanner = new Scanner(System.in);
    private static final UserRepository userRepository = new UserRepository();

    public UserService(int userType) {
        this.userType = userType;
    }

    public void createUser() {
        User user = new User();
        user.setUserType(this.userType);

        String userByType = this.getUserType(this.userType);

        System.out.println("Enter "+userByType+" id: ");
        user.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter "+userByType+" first name");
        user.setFirstName(scanner.nextLine());

        System.out.println("Enter "+userByType+" last name");
        user.setLastName(scanner.nextLine());

        System.out.println("Enter "+userByType+" mobile number");
        user.setMobileNo(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter "+userByType+" address");
        user.setAddress(scanner.nextLine());

        userRepository.addUser(user);
        System.out.println(userByType.toUpperCase() + " created!!!");
    }

    private String getUserType(int userType) {
        return switch (userType) {
            case 1 -> "customer";
            case 2 -> "seller";
            case 3 -> "delivery agent";
            default -> "";
        };
    }

    public void displayAllUsers() {
        String userByType = this.getUserType(this.userType);
        if(userRepository.getUsersSize() > 0) {
            userRepository.getAllUsers().forEach((userId, user) -> {
                System.out.println(userByType + "Id: " + userId + " " + userByType + ": " + user);
            });
        } else {
            System.out.println("No " + userByType+ "'s found to display!!");
        }
    }

    public void getUser(int userId) {
        String userByType = this.getUserType(this.userType).toUpperCase();
        if(userRepository.containsUser(userId)) {
            System.out.println(userByType + " details = " + userRepository.getUser(userId));
        } else {
            System.out.println(userByType + " id : " + userId + " does not exits!!!");
        }
    }

    public void removeUser(int userId) {
        String userByType = this.getUserType(this.userType);
        if(userRepository.containsUser(userId)) {
            System.out.println("Removed " + userByType + " details = " + userRepository.removeUser(userId));
        } else {
            System.out.println("No " + userByType+ "'s found to remove!!");
        }
    }

    public void removeAllUsers() {
        String userByType = this.getUserType(this.userType);
        if(userRepository.getUsersSize() > 0) {
            userRepository.removeAllUsers();
            System.out.println("Removed all " + userByType + "'s");
        } else {
            System.out.println("No " + userByType+ "'s found to remove!!");
        }
    }

}
