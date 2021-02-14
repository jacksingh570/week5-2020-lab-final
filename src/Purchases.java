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

    /**
     * Adds up the cost for all grocery items in the shopping cart
     * and returns them
     */
    public double getTotalPrice()
    {
        double totalPrice = 0;
//        for ( int i =0; i<shoppingCart.size();i++)
//            totalPrice = totalPrice + shoppingCart.get(i).getPrice();

        for (GroceryItem groceryItem:shoppingCart)
            totalPrice = totalPrice + groceryItem.getPrice();

        return totalPrice;
    }

    public String toString()
    {
        return String.format("The shopping cart has %d items worth $%.2f",
                shoppingCart.size(), getTotalPrice());
    }
}