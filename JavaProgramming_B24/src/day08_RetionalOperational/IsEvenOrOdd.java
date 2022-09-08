package day08_RetionalOperational;

public class IsEvenOrOdd {
    public static void main(String[] args) {

        int number = 57;

        boolean isEven = number % 2 ==1;
        boolean isOdd  = number % 3 !=0;
        System.out.println(number+ " isEver " +isEven);
        System.out.println(number+" isOdd " +isOdd);
    }
}
