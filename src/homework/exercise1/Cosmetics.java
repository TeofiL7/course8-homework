package homework.exercise1;

public class Cosmetics extends Product{
    private String color;
    private int weight;

    public Cosmetics(String color, int weight, int price, String description, String name, int quantity) {
        super(price, description, name, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}