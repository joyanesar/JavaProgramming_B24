package day50_inheritance;

public class UsingAnimals {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 10;
        //animal has access to 3 variables
        Dog dog = new Dog();
        dog.age = 10;
        dog.hasTail = true;
        //dog has access 4 variables
        Lion lion = new Lion();

        lion.roar();
        // lion has access to 5 variable and
        // 1 method

    }
}
