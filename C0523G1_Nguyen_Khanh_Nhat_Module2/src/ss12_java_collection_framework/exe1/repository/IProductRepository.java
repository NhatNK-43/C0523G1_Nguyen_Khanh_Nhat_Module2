package ss12_java_collection_framework.exe1.repository;

import ss12_java_collection_framework.exe1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void addProduct(Product product);

    void updateProduct(int id, String name, long price);

    void removeProduct(int id);

    List<Product> searchProduct(String name);

    List<Product> sortAscendingProduct();

    List<Product> sortDescendingProduct();

}
