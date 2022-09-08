package day47_Constructor;

public class StaticBlock {

   public StaticBlock(){
       System.out.println("1");  // static blocks runs first when you call in main method
   }
    static {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }

    public static void main(String[] args) {

       new  StaticBlock();
    }
}
