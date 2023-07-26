package ss17_io_binaryfile_serialization.exercise.exercise1.service;

import ss17_io_binaryfile_serialization.exercise.exercise1.model.Product;
import ss17_io_binaryfile_serialization.exercise.exercise1.repository.IProductRepository;
import ss17_io_binaryfile_serialization.exercise.exercise1.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public void display() {
        List<Product> productList = productRepository.findAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        long price = Long.parseLong(scanner.nextLine());
        System.out.print("Enter manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter describe: ");
        String describe = scanner.nextLine();

        Product product = new Product(id, name, price, manufacturer, describe);
        productRepository.add(product);
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.remove(id);
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name you want to search: ");
        String searchName = scanner.nextLine();
        productRepository.searchName(searchName);
        for (Product product : productRepository.searchName(searchName)) {
            System.out.println(product);
        }
    }
}
