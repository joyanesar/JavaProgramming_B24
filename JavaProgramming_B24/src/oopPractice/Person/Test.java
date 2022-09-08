package oopPractice.Person;

import oopPractice.Person.Person;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();


        person.name = "mike";
        person.age = 34;
        person.sex = 'M';
        person.isMarried = true;

        System.out.println(person.name + " is Married " + person.isMarried);
        System.out.println(person.sex  + " age " + person.age);

        Person person1 = new Person();

        person1.name = "Nadir";
        person1.age = 25;
        person1.isMarried = false;


        Person person2  = new Person();
        person2.name = "john";
        person2.isMarried = false;
        person2.age = 36;
        person2.job = "teacher";

        System.out.println(person2.isMarried);
        System.out.println(person2.age);
        System.out.println("FirstName : " + person2.name);

        System.out.println(person2.name + " is " + person2.job);


        Person iphone = new Person();

        iphone.name = "iphon";
        iphone.model = "proMax";
        iphone.price = 1100.5;

        System.out.println("Recent " + iphone.name + " Has released " + iphone.model);
        System.out.println("And price is " + iphone.price);



    }
}
