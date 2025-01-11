package com.lt.ecommerce.services;

import com.lt.ecommerce.models.Product;

import java.util.Scanner;

public class ProductService {
    private final Product product = new Product();
    final static Scanner scanner = new Scanner(System.in);
    public void createProduct() {

        System.out.println("Enter product id: ");
        product.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter shop id:");
        product.setShopId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter product name:");
        product.setProductName(scanner.nextLine());

        System.out.println("Enter product description:");
        product.setProductDesc(scanner.nextLine());

        System.out.println("Enter product image path:");
        product.setProductImage(scanner.nextLine());

        System.out.println("Enter product price:");
        product.setPrice(Double.parseDouble(scanner.nextLine()));

        System.out.println("product = " + product);
    }
}
