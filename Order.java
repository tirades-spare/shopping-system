// Order.java
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private User user;
    private List<Product> products;

    public Order(int orderId, User user) {
        this.orderId = orderId;
        this.user = user;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
