package ss17_io_binaryfile_serialization.exercise.exercise1.controller;

import ss17_io_binaryfile_serialization.exercise.exercise1.service.IProductService;
import ss17_io_binaryfile_serialization.exercise.exercise1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void showMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------Menu------");
            System.out.println("1. Display");
            System.out.println("2. Creat");
            System.out.println("3. Remove");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter your selection: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.creat();
                    break;
                case 3:
                    productService.remove();
                    break;
                case 4:
                    productService.search();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

}
