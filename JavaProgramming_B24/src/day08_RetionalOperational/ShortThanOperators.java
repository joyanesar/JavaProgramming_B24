package day08_RetionalOperational;

public class ShortThanOperators {
    public static void main(String[] args) {

        double parkingFee = 7.50;


//        parkingFee = parkingFee / 2; // manual way with reassigning
//        System.out.println("Your an early bird so half off  " + parkingFee);


        parkingFee /= 3;
        System.out.println("Your an early bird so half off  " + parkingFee);


        int tvs = 30;
        tvs -= 2;
        System.out.println(tvs);

        int i = 10;
        i %= 2;        // i = i % 2 --. = 10 % 2 = i =0
        System.out.println(i);
    }
}