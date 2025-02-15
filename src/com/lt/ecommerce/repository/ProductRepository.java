package com.lt.ecommerce.repository;

import com.lt.ecommerce.model.Product;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    public static final Map<Integer, Product> productMap = new HashMap<>();

    public void createProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public Map<Integer, Product> getAllProdcuts() {
        return productMap;
    }

    public Product getProduct(int productId) {
        if(this.containsProduct(productId)) {
            return productMap.get(productId);
        }
        System.out.println("Product id: " + productId + " not found !!!");
        return null;
    }

    public boolean deleteProduct(int productId) {
        if(this.containsProduct(productId)) {
            productMap.remove(productId);
            return true;
        }
        System.out.println("ProductId: " + productId + " not found to delete !!!");
        return false;
    }

    public boolean deleteAllProducts() {
        if(!productMap.isEmpty()) {
            productMap.clear();
            return true;
        }
        System.out.println("Product's not found to delete !!!");
        return false;
    }

    public boolean containsProduct(int productId) {
        return productMap.containsKey(productId);
    }


}
