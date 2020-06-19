package ru.innopolis.stc.java.lesson23;

import java.util.List;

public interface Backet {
    void addProduct(Product product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);
}
