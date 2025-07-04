public class Cheese extends Product implements Shipment{
    private   boolean expired;
    private double weight;
    public Cheese(String name,double price,int quantity,boolean expired,double weight){
        super(name,price,quantity);
        this.expired = expired;
        this.weight = weight;
    }

    boolean isExpired() {
        return expired;
    }


    boolean requiresShipping() {
        return true;
    }

    public double getWeight() {
        return this.weight;
    }
}