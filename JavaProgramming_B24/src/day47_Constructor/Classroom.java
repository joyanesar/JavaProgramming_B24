package day47_Constructor;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.batchNumber);
        CydeoStudent.batchNumber = 25;
        System.out.println(CydeoStudent.batchNumber);

        CydeoStudent studentOne = new CydeoStudent(" Nadir ", 24 , 21);
        System.out.println(studentOne);

        CydeoStudent studentTwo = new CydeoStudent("Sherlock", 10, 8);

        System.out.println(studentOne.name + " and "  + studentTwo.name + " have the following instructor: "
                + Arrays.toString(CydeoStudent.instructors));


                //check how much coffee all cydeo students have
        System.out.println(CydeoStudent.myCoffee.amountLeft);
        studentOne.myCoffee.drink(2);
        System.out.println(CydeoStudent.myCoffee.amountLeft);
        studentTwo.myCoffee.drink(3);
        System.out.println(CydeoStudent.myCoffee.amountLeft);
    }
}
