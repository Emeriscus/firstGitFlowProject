package product;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private List<Product> products = new ArrayList<>();

    public Products(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
