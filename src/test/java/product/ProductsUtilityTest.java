package product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductsUtilityTest {

    ProductsUtility productsUtility;
    List<Product> products;

    @BeforeEach
    void init() {
        productsUtility = new ProductsUtility();

        Product product1 = new Product("Hair cutter", "Philips", 15, 18_000);
        Product product2 = new Product("Lawnmower", "Briggs", 20, 54_000);
        products = List.of(product1, product2);
    }

    @Test
    void testGetSumOfStocks() {
        assertEquals(35, productsUtility.getSumOfStocks(products));
    }
}