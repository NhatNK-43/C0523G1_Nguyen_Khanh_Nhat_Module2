package ss12_java_collection_framework.exe1.repository;

import ss12_java_collection_framework.exe1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ProductRepository implements IProductRepository {

    private static List<Product> productList = new ArrayList<>(10);

    static {
        productList.add(new Product(1, "Television", 15000000));
        productList.add(new Product(2, "Air conditional", 30000000));
        productList.add(new Product(3, "Washing machine", 12000000));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    private Product getProduct(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(int id, String name, long price) {
        Objects.requireNonNull(getProduct(id)).setName(name);
        Objects.requireNonNull(getProduct(id)).setPrice(price);
    }

    @Override
    public void removeProduct(int id) {
        productList.remove(getProduct(id));
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> searchProductList = new ArrayList<>();
        for (Product p : productList) {
            if (p.getName().contains(name)) {
                searchProductList.add(p);
            }
        }
        return searchProductList;
    }

    @Override
    public List<Product> sortAscendingProduct() {
        List<Product> sortProductList = new ArrayList<>(productList);
        Collections.sort(sortProductList);
        return sortProductList;
    }

    @Override
    public List<Product> sortDescendingProduct() {
        List<Product> sortProductList = new ArrayList<>(productList);
        Collections.reverse(sortAscendingProduct());
        return sortProductList;
    }
}
