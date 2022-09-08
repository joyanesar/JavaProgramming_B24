package day56_Polymorphysm.transiportation;

public class Car extends Transiportation {

    @Override
    public void go() {
        System.out.println("CAR -- is driving");
    }



    public void openTruck(){

        System.out.println("Opening the car trunk");
    }
}
