public class Main {
    public static void main(String[] args) {
        GroceryItem item1 = new GroceryItem("mushrooms", 4.20, "Vegetables");
        GroceryItem item2 = new GroceryItem("buns", 3.60, "bread");

        Purchases shoppingCart = new Purchases();
        shoppingCart.addGroceryItem(item1);
        shoppingCart.addGroceryItem(item2);
        double total = shoppingCart.getTotalPrice();
        System.out.printf("The total price is: $%.2f%n", total);

        GroceryItem item3 = new GroceryItem("cheese", 1.50, "dairy");
        shoppingCart.addGroceryItem(item3);
        shoppingCart.addGroceryItem(new GroceryItem("milk", 12.50, "dairy"));
        System.out.println(shoppingCart);
    }
}
