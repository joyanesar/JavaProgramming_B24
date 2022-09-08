package day09_Scanner_Logical;

public class LogicalOperators {
    public static void main(String[] args) {

      /*

      Math ex:

      3 < i < 40


       */

//        int a = 3;
//        int z = 40;
        int i = 5;
        boolean outPut =  i > 3 && i < 40;

        System.out.println(outPut);

        boolean outPut2 =  i < 3 || i > 40;
        System.out.println(outPut2);



        int min  = 3;
        int max  = 40;

//        boolean result = min > max && max <min;
        System.out.println(i > min && i < max);
        System.out.println(i < min || i > max);

        System.out.println(true || false && true);
        System.out.println((true || false) && true);

        System.out.println(i < min && i < max);




    }
}
