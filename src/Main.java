import com.lt.ecommerce.controller.DeliveryAgentController;
import com.lt.ecommerce.controller.SellerController;
import com.lt.ecommerce.controller.ShopController;
import com.lt.ecommerce.controller.UserController;
import com.lt.ecommerce.service.OrderService;
import com.lt.ecommerce.service.ProductService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("--------Ecommerce--------");
            System.out.println("Please choose the option");
            System.out.println("1 Go to customer section");
            System.out.println("2 Go to seller section");
            System.out.println("3 Go to delivery agent section");
            System.out.println("4 Go to shop section");
            System.out.println("5 Go to product section");
            System.out.println("6 Go to order section");
            System.out.println("9 Exit");
            option = Integer.parseInt(scanner.nextLine());

            UserController userController = new UserController();
            SellerController sellerController = new SellerController();
            DeliveryAgentController deliveryAgentController = new DeliveryAgentController();

            ShopController shopController = new ShopController();
            ProductService productService = new ProductService();
            OrderService orderService = new OrderService();

            switch (option) {
                case 1: {
                    userController.run();
                    break;
                }
                case 2: {
                    sellerController.run();
                    break;
                }
                case 3: {
                    deliveryAgentController.run();
                    break;
                }
                case 4: {
                    shopController.run();
                    break;
                }
                case 5: {
                    productService.createProduct();
                    break;
                }
                case 6: {
                    orderService.createOrder();
                    break;
                }
            }

        } while(option != 9);
    }
}
