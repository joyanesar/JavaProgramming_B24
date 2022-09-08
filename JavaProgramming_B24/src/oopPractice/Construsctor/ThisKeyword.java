package oopPractice.Construsctor;

public class ThisKeyword {

    int a = 100;  // instance variable

    public ThisKeyword(int a){  // local variable
        System.out.println(a); // a value is 200
        a = 400;  // reassign
        System.out.println(a); // a value is 400

    }

    public static void main(String[] args) {
        ThisKeyword ob = new ThisKeyword(200);
        System.out.println(ob.a);




    }
}
