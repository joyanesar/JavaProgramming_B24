package day54_abstruction.hiding;

public class B extends  A{

    public static void staticMethod(){
        System.out.println("B");
    }

    public void instanceMethodB(){
        staticMethod();
    }


}
