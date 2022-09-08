package day45_Constructor;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {


        Employee one = new Employee("James Bond",007,"agent", 159000);

        one.goToMeeting();
        System.out.println(one);

        Employee[] staff = new Employee[3];

        staff[0] = one;
        staff[1] = new Employee("NadirOne",12,"SDET",12999.99);
        staff[2]  = new Employee("NadirTwo",10,"Softskill",9999.99);

        System.out.println(Arrays.toString(staff));


    }


}
