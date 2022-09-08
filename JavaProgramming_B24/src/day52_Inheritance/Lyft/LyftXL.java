package day52_Inheritance.Lyft;

public class LyftXL extends Lyft{  // This is subclass


    @Override
    public double calculateRate (int miles){
        return super.calculateRate(miles) * 1.1;


    }


}
