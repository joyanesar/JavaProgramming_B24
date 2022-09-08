package day56_Polymorphysm.learn_interface;

public interface CanTalk  {

    // abstract method // how can we make code that hase interface
    void  speak();

    public  static  void  yell(){
        System.out.println("Yelling!!");
        System.out.println("When you yell then  you will lose your concentrate ND!");

    }
    public default void whisper(){  // default allow you to use the code
        System.out.println("Whispering shh");

    }

}
