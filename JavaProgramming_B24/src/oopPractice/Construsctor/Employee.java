package oopPractice.Construsctor;

public class Employee {

    String name;
    int id;
    String jobTitle;
    double salary;


    public Employee(String name1, int id1 , String jobTitle1, double salary1){

        name = name1;
        id = id1;
        jobTitle = jobTitle1;
        salary = salary1;
    }
    public void getReadyForClass(){
        System.out.println(name + " go to class");

    }



    @Override
    public String toString() {
        return "Employee{" +
                "name  : " + name +
                " id "  + id +
                " jobTitle : " + jobTitle + '\'' +
                " salary : " + salary +
                '}';
    }
}
