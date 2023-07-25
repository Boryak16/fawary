import java.util.List;

class OrderProcessor {
    public void placeOrder(ShoppingCart cart) {
        List<Product> items = cart.getItems();
        System.out.println("Order Details:");
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Cost: $" + cart.getTotalCost());
    }
}