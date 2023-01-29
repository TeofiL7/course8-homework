package homework.exercise1;

public class Fridge extends Electronics {
    private int temperature;

    public Fridge(int temperature, String type, int length, int width, int height, int weight, int price, String description, String name, int quantity) {
        super(type, length, width, height, weight, price, description, name, quantity);
        this.temperature = temperature;

    }

    public int getTemperature() {
        return temperature;
    }
}