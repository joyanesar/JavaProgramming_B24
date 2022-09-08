package day45_Constructor;

public class UsingStudent {
    public static void main(String[] args) {

        Student studentOne = new Student();

        studentOne.name = "James Bond";
        studentOne.batchNumber = 24;
        studentOne.major = "Software Engineer Development";
        studentOne.salary = 160000;

        System.out.println(studentOne);// to string method automatically called
//        System.out.println(studentOne.toString());



    }
}
