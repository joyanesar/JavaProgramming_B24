package Office_Hours.paractice_10_13_21;

public class Developer {

/*
create a class called Developer
                    Attributes:
                        instance: name, employee id, job title, salary
                        static: can code (boolean)

                    Constructor:
                        - accepts and sets all instance variables
                        - overload to also create an object with only the name and employee id

                    Actions:
                        coding(),  fixingBug(), toString()
 */
    String name;
    int    id;
    String jobTitle;
    double salary;

    static boolean canCode;

    static {
        canCode = true;
    }

    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Developer(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }
    public void fixingBug(){
        System.out.println(name + " is fixing  a bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
