import java.util.Scanner;

public class OnlineShopApplication {
    public static void main(String[] args) {
        Scanner prod = new Scanner(System.in);
        System.out.println(
                        "1.prod1\n" +
                        "2.prod2\n" +
                        "3.prod3\n" +
                        "4.prod4\n" +
                        "5.prod5\n" +
                        "6.prod16\n" +
                         "enter numb of prod u wnt:"

        );
        int num = prod.nextInt();
        Product product1 = new Product("Prod 1", 1);
        Product product2 = new Product("Prod 2", 1);
        Product product3 = new Product("Prod 3", 1);
        Product product4 = new Product("Prod 4", 1);
        Product product5 = new Product("Prod 5", 1);
        Product product6 = new Product("Prod 6", 1);
        ShoppingCart cart = new ShoppingCart();
switch (num)
{
    case 1 :

        cart.addItem(product1);
        break;
    case 2:
        cart.addItem(product2);
        break;
    case 3:
        cart.addItem(product3);
        break;
    case 4:
        cart.addItem(product4);
        break;
    case 5:
        cart.addItem(product5);
        break;
    case 6:
        cart.addItem(product6);

        break;
    default:
        throw new IllegalStateException("Unexpected value: " + num);
}

        System.out.println("Total Cost in the Shopping Cart: $" + cart.getTotalCost());

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.placeOrder(cart);
    }
}
