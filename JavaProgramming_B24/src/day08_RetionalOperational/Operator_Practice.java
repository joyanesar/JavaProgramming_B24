package day08_RetionalOperational;

public class Operator_Practice {
    public static void main(String[] args) {


        int w = 78 / 2 * 2 + 3 - 5 % 5; // left to right
        // 39  * 2 + 3 - 5 % 5
        //  78
        // 78
        // 81

        System.out.println("W: " + w);


        int a = 8; // 7
        int b = a--; // b = 8
        System.out.println(a);
        System.out.println(b);


        int c = 1;
        int d = -c-- + c++ / -c-- * --c; // c = 0

        //  -1  + 0 / - 1 *  -1

        System.out.println("c is " + c);
        System.out.println("d id " + d);


        int r = 4;
        r++;
        ++r;
        System.out.println(r);


        int t = 100;   /// t
        int p = -++t * -t-- / t++ + --t;
        System.out.println(t);
        System.out.println(p);

        int R = 20; // R = 20 | 19 | 20 | -19 | 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //       - 20 + - 19  + 19 * 19  % 2
        System.out.println(R);
        System.out.println(W);


    }
}