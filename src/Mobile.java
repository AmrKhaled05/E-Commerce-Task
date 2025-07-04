public class Mobile extends Product {
    private boolean isExpired;
    private boolean requiresShipping;

    public Mobile(String name, double price, int quantity, boolean isExpired, boolean requiresShipping) {
        super(name, price, quantity);
        this.isExpired = isExpired;
        this.requiresShipping = requiresShipping;
    }


    boolean isExpired() {
        return false;
    }


    boolean requiresShipping() {
        return false;
    }


}