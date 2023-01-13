package product;

public class Product {

    private String name;
    private String brand;
    private int stock;
    private int price;

    public Product(String name, String brand, int stock, int price) {
        this.name = name;
        this.brand = brand;
        this.stock = stock;
        this.price = price;
    }

    public Product(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", stock=" + stock +
                ", price=" + price + " Ft" +
                '}';
    }
}
