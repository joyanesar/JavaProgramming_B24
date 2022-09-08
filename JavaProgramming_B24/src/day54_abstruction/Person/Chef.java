package day54_abstruction.Person;

public class Chef extends Employee {


    @Override
    public void work() {
        System.out.println("Cooking the meal");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Didnt sleep all night because she burnt the food");

    }
}
