package Office_Hours_10_21_2021;

public class Store {
    public static void main(String[] args) {


        WaterBottle waterBottle = new WaterBottle("Nestle",24);


        System.out.println(waterBottle.getBrand());
        System.out.println(waterBottle.getOunces());
        waterBottle.setOunces(-20);
        System.out.println(waterBottle.getOunces());
        waterBottle.setBrand(null);
        waterBottle.setBrand("");
        System.out.println(waterBottle.getBrand());


    }
}
