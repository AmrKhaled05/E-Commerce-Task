public class Main {
    public static void main(String[] args) {
        Cheese cheese = new Cheese("Cheese", 100, 10, false, 0.2);
        Biscuits biscuits = new Biscuits("Biscuits", 150, 5, false, 0.7);;
        TV tv = new TV("TV", 500, 50, 10);
        Mobile mobile = new Mobile("Mobile", 800, 2,false,false);
        Customer customer = new Customer("Amr","kamr08985@gmail.com" ,18,"01094259030",1000);
        Cart cart = new Cart();
        try {
            Product.addProduct(cheese, cheese.getQuantity());
            cart.addProduct(cheese, 2);
            Product.addProduct(biscuits, biscuits.getQuantity());
            cart.addProduct(biscuits, 1);
            //Product.addProduct(tv, tv.getQuantity());
            //cart.addProduct(tv, 3);
            //Product.addProduct(mobile, mobile.getQuantity());
            //cart.addProduct(mobile, 1);
        } catch (ProductNotFoundException | QuantityNotSufficientException e ) {
            System.out.println(" Error occured while products added to the cart: " + e.getMessage());
        }
        try {
            ShippingService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
    }
}