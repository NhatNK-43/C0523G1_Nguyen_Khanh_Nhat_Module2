package ss17_io_binaryfile_serialization.exercise.exercise1.repository;

import ss17_io_binaryfile_serialization.exercise.exercise1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);

    void remove(int id);

    List<Product> searchName(String searchName);

}
