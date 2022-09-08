package day58_exceptions.item;

public class Book extends Item{

    public Book(String name){
        super(name);


    }

    @Override
    public void Use() {
        System.out.println("Reading a Book");
    }
}
