package ss17_io_binaryfile_serialization.exercise.exercise1.repository;

import ss17_io_binaryfile_serialization.exercise.exercise1.model.Product;
import ss17_io_binaryfile_serialization.exercise.exercise1.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    final String FILE_PATH = "D:\\Javafullstack_Codegym\\C0523G1_Nguyen_Khanh_Nhat_Module2\\C0523G1_Nguyen_Khanh_Nhat_Module2\\src\\ss17_io_binaryfile_serialization\\exercise\\exercise1\\data\\product.dat";

    @Override
    public List<Product> findAll() {
        List<Product> productList = ReadAndWriteFile.readFile(FILE_PATH);
        return productList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList = findAll();
        productList.add(product);
        ReadAndWriteFile.writeFile(FILE_PATH, productList);
    }

    @Override
    public void remove(int id) {
        List<Product> productList = findAll();
        int index = productList.indexOf(new Product(id));
        productList.remove(productList.get(index));
    }

    @Override
    public List<Product> searchName(String searchName) {
        List<Product> productList = findAll();
        List<Product> searchProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(searchName.toLowerCase())) {
                searchProductList.add(product);
            }
        }
        return searchProductList;
    }
}
