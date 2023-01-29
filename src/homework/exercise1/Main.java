package homework.exercise1;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmetics = new Cosmetics("transparenta", 50, 100, "pielea arata mai luminoasa", "Synchronized", 50);
        System.out.printf(" %s este un ser impotriva imbatraniri, %s. Are o culoare %s, greutatea %s ml pretul de numai %s lei. " +
                        "Stoc disponibil de %s bucati. ", cosmetics.getName(), cosmetics.getDescription(), cosmetics.getColor(),
                cosmetics.getWeight(), cosmetics.getPrice(), cosmetics.getQuantity());


        Electronics radiator = new Electronics("elctric", 65, 22.7, 47.5, 7.5, 300, "calitatea excelentă și durabilitatea", "Bansin Crystal Smart", 68);
        System.out.printf(" %s este un radiator cu convector de o %s are o inaltime de %s cm, latime de %s cm," +
                        " lungimea de %s si o greutate de %s kg. Este %s si are un pret de %s lei. Cantitate in stoc %s de bucati.", radiator.getName(), radiator.getDescription(),
                radiator.getHeight(), radiator.getWidth(), radiator.getWidth(), radiator.getLength(), radiator.getWeight(), radiator.getType(), radiator.getQuantity());


        Fridge fridge = new Fridge(10, "elcetric", 50, 50, 170, 14, 2000, "o alegere buna", "Beko", 12);
        System.out.printf("Frigiderul %s o %s pentru casa ta, este %s poti pastra totul la sun %s grade. Dimesiunile lungime %s cm, latime %s cm, inaltime %s," +
                "si grutatea de %s kg, la un pret de %s lei. Stocul de %s bucati. ", fridge.getName(),fridge.getDescription(),fridge.getType(),fridge.getTemperature(),
                fridge.getLength(),fridge.getWidth(),fridge.getHeight(),fridge.getWeight(),fridge.getPrice(),fridge.getQuantity());
    }

}
