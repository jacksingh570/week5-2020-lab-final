public class Main {
    public static void main(String[] args) {
        GroceryItem item1 = new GroceryItem("carrots",4.79,"vegetables");
        GroceryItem item2 = new GroceryItem("bread",2.89,"bread");

        Purchases shoppingCart = new Purchases();
        shoppingCart.addGroceryItem(item1);
        shoppingCart.addGroceryItem(item2);
        double total = shoppingCart.getTotalPrice();
        System.out.printf("The total price is: $%.2f%n",total);

        GroceryItem item3 = new GroceryItem("ice cream",7.89,"dairy");
        shoppingCart.addGroceryItem(item3);
        shoppingCart.addGroceryItem(new GroceryItem("cheese",12.98,"dairy"));
        System.out.println(shoppingCart);
    }
}
