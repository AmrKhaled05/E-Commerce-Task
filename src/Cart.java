import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Product,Integer>items;
    List<Product> shippedItems;
    public Cart(){
        items=new HashMap<>();
        shippedItems=new ArrayList<>();
    }
    public void addProduct(Product p,int quantity)throws ProductNotFoundException,QuantityNotSufficientException{
        if (!Product.products.containsKey(p)){
            throw new ProductNotFoundException("Product is out of the stock");
        }else if(quantity>p.getQuantity()){
            throw new QuantityNotSufficientException("The quantity required is larger than the product's quantity");
        }else if (quantity<=0){
            throw new IllegalArgumentException("Quantity must be greater than 0 for product '" + p.getName() + "'.");
        }else{
            int q=p.getQuantity()-quantity;
            Product.products.put(p,p.getQuantity()-quantity);
            items.put(p,quantity);
        }
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}