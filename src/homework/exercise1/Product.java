package homework.exercise1;

public class Product {
    private int price;
    private String name;
    private String description;
    private  int quantity;

    public Product(int price, String description, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
