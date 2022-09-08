package day56_Polymorphysm.transiportation;

public class Tesla extends Car implements SelfDrivable, Electric {


    @Override
    public void go() {
        System.out.println("Tesla -- Tesla is driving");
    }

    @Override
    public void charge() {

        System.out.println("Tesl is charging");

    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is an auto pilot");

    }
}
