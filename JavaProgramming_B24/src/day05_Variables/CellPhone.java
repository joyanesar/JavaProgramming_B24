package day05_Variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "samsung";
        String model =  "note5";
        String color =  "white";
        double price =   1264.95;
        int    storage = 512;
        boolean hasCamera = true;

        color = "Black"; // reassigned.
        price  =  500.99;

        System.out.println("My new cellPhone is "+ brand + "\t and the model is " + model +"\n and the color is "+ color );
        System.out.println("It has "+ storage + " gb and it has triple Camera" + hasCamera + " and the price is "+price + '$');

        String info ;


//        System.out.println("Information for the " + brand);
//        System.out.println(model + " is a " + color + " color");
//


    }
}
