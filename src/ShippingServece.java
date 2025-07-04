import java.util.Map;
class ShippingService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.items.isEmpty()) {
            System.out.println("The cart is empty");
            return;
        }

        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        for (Map.Entry<Product, Integer> entry : cart.items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0 && product instanceof Shipment) {
                Shipment shippable = (Shipment) product;
                double weight = shippable.getWeight() * quantity * 1000;
                totalWeight += weight;
                System.out.println(quantity + "x " + product.getName() + " " + (int) weight + "g");
            }
        }
        System.out.println("Total package weight " + (totalWeight / 1000) + "kg");

        System.out.println("** Checkout receipt **");
        double subtotal = 0;
        for (Map.Entry<Product, Integer> entry : cart.items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if (product instanceof Shipment) {
                double productTotal = product.getPrice() * quantity;
                subtotal += productTotal;
                System.out.println(quantity + "x " + product.getName() + " " + (int) productTotal);
            }
        }
        double shippingFee = 30;
        double totalAmount = subtotal + shippingFee;

        System.out.println("----------------------");
        System.out.println("Subtotal " + (int) subtotal);
        System.out.println("Shipping " + shippingFee);
        System.out.println("Amount " + (int) totalAmount);

        if (customer.getBalance() < totalAmount) {
            System.out.println(" Customer has insufficient balance.");
            return;
        }

        customer.setBalance(customer.getBalance() - totalAmount);
        System.out.println("Customer Balance  value after payment: " + customer.getBalance());
    }
}