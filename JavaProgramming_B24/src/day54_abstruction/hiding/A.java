package day54_abstruction.hiding;

public class A {

    public static void staticMethod(){
        System.out.println("A");
    }

    public void instanceMethodA(){
        staticMethod();
    }
}
