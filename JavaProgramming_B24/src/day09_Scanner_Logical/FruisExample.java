package day09_Scanner_Logical;

public class FruisExample {
    public static void main(String[] args) {


        int apples = 5;  // 6 // 7

        boolean check = apples++ * 2 >= 12 && ++apples + 3 == 10;
//                  apples++ * >= 12 & ++apples + 3 == 10;
//                   5 * 2>= 12 && 7 + 3  ==10
//                   10 >= 12   && 10 ==10
//
        System.out.println(check);
        System.out.println(apples);
    }
}