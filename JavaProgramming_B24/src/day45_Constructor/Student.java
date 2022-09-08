package day45_Constructor;

public class Student {

    String name;  // this is the instance variable
    int    batchNumber;
    String major;
    double salary ;


    public String toString(){   // to  string method is called automatically when you print

        String s = "Student Information:";
        s += "\nName: " + name; // this is the instance method
        s += "\nBatch: " + batchNumber;
        s += "\nMajor: " + major;
        s += "\nSalary: " + salary;

        return s;

    }
}
