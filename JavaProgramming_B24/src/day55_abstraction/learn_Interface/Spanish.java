package day55_abstraction.learn_Interface;

public class Spanish implements Language{
    @Override
    public void hello() {

        System.out.println("Hola");

    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}
