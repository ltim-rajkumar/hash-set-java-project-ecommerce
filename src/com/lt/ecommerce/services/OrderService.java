package com.lt.ecommerce.services;

import com.lt.ecommerce.models.Order;

import javax.print.Doc;
import java.util.Scanner;

public class OrderService {
    static final Order order = new Order();
    static final Scanner scanner = new Scanner(System.in);
//    private int id;
//    private int customerId; // User.id
//    private int productId; // Product.id
//    private double price;
//    private int qty;
//    private double tax;
//    private double finalAmount;

    public void createOrder() {
        System.out.println("Enter order id:");
        order.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter customer id:");
        order.setCustomerId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter product id:");
        order.setProductId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter product price:");
        order.setPrice(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter product quantity:");
        order.setQty(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter product tax amount:");
        order.setTax(Double.parseDouble(scanner.nextLine()));

        System.out.println("Enter order final amount:");
        order.setFinalAmount(Double.parseDouble(scanner.nextLine()));

        System.out.println("order = " + order);
    }

}
