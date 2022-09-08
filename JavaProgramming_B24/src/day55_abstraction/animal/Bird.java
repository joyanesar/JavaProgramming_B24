package day55_abstraction.animal;

public class Bird extends Animal implements Flyable {

    @Override
    public void fly() {

        System.out.println("All bird can fly");

    }

    @Override
    public void eat() {
        System.out.println("Animal eats a lot");

    }

    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.name = "Eagle";
        bird.eat();
        bird.fly();


    }
}
