import java.util.Arrays;
import java.util.List;

public class GroceryItem {
    private String name;
    private double price;
    private String category;

    public GroceryItem(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException("name must have at least 2 characters");
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price >= 0 && price <= 200){
            this.price = price;
        }else{
            throw
        }
    }
}
