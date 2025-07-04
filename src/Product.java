import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;
    public  static Map<Product,Integer> products=new HashMap<>();

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static Map<Product, Integer> getProducts() {
        return products;
    }
    public static void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }
}

