package day49_Encapsulation;

public class ReviewStaticOne {
    public static void main(String[] args) {
        System.out.println("A");
        new ReviewStaticOne();
        methodOne();

    }
    public ReviewStaticOne(){        // CONSTRUCTOR
        System.out.println("B");
    }
    static {                        //static use instance in statice block
        System.out.println("C");
    }
    public static void methodOne(){ // static method
        System.out.println("D");
    }
}
