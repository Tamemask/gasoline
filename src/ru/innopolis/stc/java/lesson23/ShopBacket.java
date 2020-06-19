package ru.innopolis.stc.java.lesson23;

import java.util.ArrayList;
import java.util.List;

public class ShopBacket implements Backet {
    ArrayList <Product> products = new ArrayList<Product>();

    @Override
    public void addProduct(Product product, int quantity) {

    }

    @Override
    public void removeProduct(String product) {

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
