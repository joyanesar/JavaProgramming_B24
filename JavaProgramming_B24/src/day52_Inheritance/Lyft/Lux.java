package day52_Inheritance.Lyft;

public class Lux extends Lyft {

    //overide means change


    @Override
    public double calculateRate(int miles) {
        return super.calculateRate(miles) * 1.2;
    }
}
