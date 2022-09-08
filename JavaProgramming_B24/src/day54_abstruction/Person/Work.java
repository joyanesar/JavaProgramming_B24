package day54_abstruction.Person;

import day53_Inheritance.Rules.C;

public class Work {
    public static void main(String[] args) {
       // Person person = new Person(); cannot creat an object of person because it is abstract class

        //Employee employee = new Employee(); cannot creat an object of Employee because its abstract class

        Tester tester = new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle = "Tester";

        Developer developer = new Developer();
        developer.work();
        developer.sleep(25);

        Chef chef = new Chef();
        chef.work();
        chef.sleep(30);
    }
}
