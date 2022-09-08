package oopPractice.Animal;

import oopPractice.Animal.Animal;

public class Cat {

    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.species = " Shadoo ";
        animal.size = " small ";
        animal.numberOfLegs = 4;
        animal.canFly = false;
        animal.isMammal = false;

        animal.sleeping();
        animal.eat();
        animal.fly();
        animal.weighting();

        Animal animal1 = new Animal();
        animal1.species = "tiger";
        animal1.eat();
        animal1.fly();
        animal1.sleeping();
        animal.size = "small";

        animal1.numberOfLegs = 4;
        System.out.println(animal1.numberOfLegs);

        animal1.canFly = false;
        System.out.println(animal1.canFly);

        Animal animal2 = new Animal();

        animal2.species = "Lion";
        animal2.roar();
        animal2.hunting();

        new  Animal().hunting();

        Animal dog = new Animal();
        dog.species = "mooti";
        dog.sleeping();
        dog.canFly = false;
        dog.fly();
    }
}
