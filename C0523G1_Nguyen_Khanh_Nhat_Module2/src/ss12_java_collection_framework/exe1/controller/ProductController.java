package ss12_java_collection_framework.exe1.controller;

import ss12_java_collection_framework.exe1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("-------Menu-------");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Update");
            System.out.println("4. Remove");
            System.out.println("5. Sort ascending by price");
            System.out.println("6. Sort descending by price");
            System.out.println("7. Exit");
            do {
                System.out.print("Enter your selection: ");
                select = scanner.nextInt();
                if (select < 1 || select > 7) {
                    System.out.println("Your selection is not valid. Please re-enter!");
                }
            } while (select < 1 || select > 7);
            switch (select) {
                case 1:
                    productService.displayProduct();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.updateProduct();
                    break;
                case 4:
                    productService.removeProduct();
                    break;
                case 5:
                    productService.sortAscendingProduct();
                    break;
                case 6:
                    productService.sortDescendingProduct();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
