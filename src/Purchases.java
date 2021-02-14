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


}