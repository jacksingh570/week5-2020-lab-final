import java.util.ArrayList;

public class Purchases {
    private ArrayList<GroceryItem> shoppingCart;

    public Purchases() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addGroceryItem(GroceryItem groceryItem)
    {
        shoppingCart.add(groceryItem);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(GroceryItem groceryItem:shoppingCart){
            totalPrice = totalPrice + groceryItem.getPrice();
        }
        return totalPrice;
    }

    public String toString(){
        return String.format("The shopping cart has %d items worth $%.2f", shoppingCart.size(), getTotalPrice());
    }
}