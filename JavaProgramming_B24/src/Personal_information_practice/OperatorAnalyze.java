package Personal_information_practice;

public class OperatorAnalyze {
    public static void main(String[] args) {



        int a = 3, b =2;

        long c =(a--+b)*2 / 3 % 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println("k value is " + c );


        int numeOne = 10;
        int numTwo  = numeOne ++ * 3 + ++numeOne + numeOne++ % 2;
        int biggest = numeOne > numTwo? numeOne : numTwo;
        System.out.println(numTwo);

    }
}
