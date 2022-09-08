package day45_Constructor;

public class Employee {

    String name;

    int id;
    String title;
    double salary;

    public Employee (String name1, int idNumber, String titleJob, double anualSalary){

        name = name1;
        id = idNumber;
        title = titleJob;
        salary = anualSalary;  // purple means instance variable
    }


    public void goToMeeting(){
        System.out.println(name + " is going to attend the meeting ");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }


    public static void main(String[] args) {

        Employee employee = new Employee("James Bond", 0007, "Manager", 159999.99);

        employee.goToMeeting();
        System.out.println(employee);
    }





}
