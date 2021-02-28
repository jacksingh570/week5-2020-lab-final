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
            totalPrice += totalPrice + groceryItem.getPrice();
        }
        return totalPrice;
    }

    public String getGroceryNames(){
        String groceries = "";
        for (GroceryItem groceryItem:shoppingCart){
            groceries += groceryItem.getName() + ", ";
        }
        return groceries.substring(0,groceries.length()-2);
    }

    public String getCategories(){
        String groceries = "";
        for (GroceryItem groceryItem:shoppingCart){
            groceries += groceryItem.getCategory() + ", ";
        }
        return groceries.substring(0,groceries.length()-2);
    }

    public String toString(){
        return String.format("The shopping cart has %d items worth $%.2f", shoppingCart.size(), getTotalPrice());
    }
}