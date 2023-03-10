package product;

import java.util.List;

public class ProductsUtility {
    public int getSumOfStocks(List<Product> products) {
        int sum = 0;
        for (Product actual : products) {
            sum += actual.getStock();
        }
        return sum;
    }

    public int getTotalValueOfStocks(List<Product> products) {
        int sum = 0;
        for (Product actual : products
        ) {
            sum += actual.getStock() * actual.getPrice();
        }
        return sum;
    }
}
