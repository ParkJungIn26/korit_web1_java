package _21_Access.bottle;

public class Main {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle(0);

        waterBottle.fill(500);
        waterBottle.fill(800);
        waterBottle.drink(400);
        waterBottle.drink(400);
        waterBottle.drink(800);
        waterBottle.fill(-10);
        waterBottle.drink(-10);

        System.out.println(waterBottle.getCurrentWater());





    }
}
