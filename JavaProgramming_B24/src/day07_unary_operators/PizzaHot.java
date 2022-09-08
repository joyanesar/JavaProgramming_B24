package day07_unary_operators;

public class PizzaHot {
    public static void main(String[] args) {

        String type       = "cheese";
        int    pizzaSlic  =  8;
        int    people     =  4;

        int pizzaSlice = pizzaSlic / people;


        System.out.println("We ordered " + type + " pizza with " + pizzaSlic + " slieces," + people+ "people ate "+ pizzaSlice + " slices each");


    }
}
