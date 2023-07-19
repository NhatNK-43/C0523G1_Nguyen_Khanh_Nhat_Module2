package ss12_java_collection_framework.exe1.service;

import ss12_java_collection_framework.exe1.model.Product;

import java.util.List;

public interface IProductService {
    void displayProduct();

    void addProduct();

    void updateProduct();

    void removeProduct();

    void sortAscendingProduct();

    void sortDescendingProduct();
}
