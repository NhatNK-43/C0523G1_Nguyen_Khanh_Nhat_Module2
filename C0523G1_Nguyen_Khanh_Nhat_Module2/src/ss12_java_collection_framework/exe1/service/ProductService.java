package ss12_java_collection_framework.exe1.service;

import ss12_java_collection_framework.exe1.model.Product;
import ss12_java_collection_framework.exe1.repository.IProductRepository;
import ss12_java_collection_framework.exe1.repository.ProductRepository;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();
    public Scanner scanner = new Scanner(System.in);

    @Override
    public void displayProduct() {
        List<Product> productList = productRepository.findAll();
        for (Product p : productList) {
            System.out.println(p);
        }
        System.out.println();
    }

    private int getIndexId(int id) {
        for (int i = 0; i < productRepository.findAll().size(); i++) {
            if (productRepository.findAll().get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private int checkId() {
        int id;
        do {
            System.out.print("Enter id: ");
            id = Integer.parseInt(scanner.nextLine());
            if (getIndexId(id) == -1) {
                System.out.println("Not found product id: " + id + ". Please re-enter!");
            }
        } while (getIndexId(id) == -1);
        return id;
    }

    @Override
    public void addProduct() {
        int id;
        do {
            System.out.print("Enter id: ");
            id = Integer.parseInt(scanner.nextLine());
            if (getIndexId(id) != -1) {
                System.out.println("Id already exists. Please re-enter!");
            }
        } while (getIndexId(id) != -1);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        long price = Long.parseLong(scanner.nextLine());
        productRepository.addProduct(new Product(id, name, price));
        System.out.println("Add successful!\n");
    }

    @Override
    public void updateProduct() {
        checkId();
        int select;
        do {
            System.out.println("\n-------Update-----");
            System.out.println("1. Name");
            System.out.println("2. Price");
            System.out.println("3. Both");
            System.out.println("4. Exit");
            do {
                System.out.print("Enter your select: ");
                select = Integer.parseInt(scanner.nextLine());
                if (select < 1 || select > 4) {
                    System.out.println("Your selection is not valid. Please re-enter!");
                }
            } while (select < 1 || select > 4);

            switch (select) {
                case 3:
                case 1:
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    productRepository.updateProduct(checkId(), newName, productRepository.findAll().get(getIndexId(checkId())).getPrice());
                    if (select != 3) {
                        break;
                    }
                case 2:
                    System.out.print("Enter new price: ");
                    long newPrice = Long.parseLong(scanner.nextLine());
                    productRepository.updateProduct(checkId(), productRepository.findAll().get(getIndexId(checkId())).getName(), newPrice);
                    break;
                case 4:
                    break;
            }
            System.out.println("Update successful!\n");
        } while (select != 4);
    }

    @Override
    public void removeProduct() {
        productRepository.removeProduct(checkId());
        System.out.println("Remove successful!\n");
    }

    @Override
    public void sortAscendingProduct() {
        for (Product p : productRepository.sortAscendingProduct()) {
            System.out.println(p);
        }
        System.out.println();
    }

    @Override
    public void sortDescendingProduct() {
        for (Product p : productRepository.sortDescendingProduct()) {
            System.out.println(p);
        }
        System.out.println();
    }
}
