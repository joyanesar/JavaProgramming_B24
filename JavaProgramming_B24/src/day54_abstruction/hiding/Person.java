package day54_abstruction.hiding;

public class Person {

    String name = "James Bond";
}

class Baby extends Person{
    String name = "Mike Smith "; // be creating another name variable is the sub class he hide the name from
    // the parent

}

class Runner{

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Baby baby = new Baby();
        System.out.println(baby.name);
    }
}


