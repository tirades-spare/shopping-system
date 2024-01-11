// OnlineStore.java
public class OnlineStore {
    public static void main(String[] args) {
        User user = new User("john_doe", "john@example.com");
        Product laptop = new Product("Laptop", 1200.0);
        Product headphones = new Product("Headphones", 99.99);

        // Simulate shopping
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(headphones);

        Order order = new Order(1, user);
        order.addProduct(laptop);
        order.addProduct(headphones);

        // Display order details
        displayOrderDetails(order, cart);
    }

    private static void displayOrderDetails(Order order, ShoppingCart cart) {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("User: " + order.getUser().getUsername() + " (" + order.getUser().getEmail() + ")");
        System.out.println("Products:");

        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }

        System.out.println("Total: $" + order.calculateTotal());
        System.out.println("Shopping Cart Total: $" + cart.calculateTotal());
    }
}
