package day55_abstraction.learn_Interface;

public class English  implements Language{ //this is concrete
    //class


    @Override
    public void hello() {
        System.out.println("Hello");

    }

    @Override
    public void bye() {
        System.out.println("Good bye");

    }
}
