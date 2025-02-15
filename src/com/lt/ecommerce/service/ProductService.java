package com.lt.ecommerce.service;
import com.lt.ecommerce.model.Product;
import com.lt.ecommerce.repository.ProductRepository;

public class ProductService {

    private static final ProductRepository productRepository = new ProductRepository();

    public void createProduct() {
        Product product = new Product();
        product.setId(3001);
        product.setShopId(4001);
        product.setProductName("Laptop");
        product.setProductDesc("intel i10, 11th Gen, 64GB RAM, 2TB SSD");
        product.setProductImage("Image path");
        product.setPrice(79999.90);

        productRepository.createProduct(product);

        System.out.println("product = " + product);
    }

    public void getProduct(int productId) {
        Product product = productRepository.getProduct(productId);
        if(product != null) {
            System.out.println("Product details: " + product);
        }
    }

    public void displayAllProducts() {
        if(!productRepository.getAllProdcuts().isEmpty()) {
            productRepository.getAllProdcuts().forEach((productId, product) -> {
                System.out.println("Product id: " + productId + " and Product details are: " + product);
            });
        }
    }
}
