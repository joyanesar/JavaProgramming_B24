package day54_abstruction.Person;

public abstract class Employee  extends  Person{


    String jobTitle;
    double salary;

    public abstract void work();

}
/*


    Employee (abstract) inherits Person

        instance variables:
            job title, salary

        abstract method:

            work()


 */