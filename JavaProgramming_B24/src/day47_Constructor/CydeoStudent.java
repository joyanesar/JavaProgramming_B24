package day47_Constructor;

public class CydeoStudent {

    String name;
    int id;          // these are instance variable
    int groupNumber;

    static  Coffee myCoffee;

    static int batchNumber;
    static String [] instructors;  // these are class
    static String  schoolName;

    static int batchN ;
    static String [] trainers;
    static String schoolN;

    public CydeoStudent(String name, int id, int groupNumber) {
        this.name = name;
        this.id = id;
        this.groupNumber = groupNumber;

    }
    static {
        batchNumber = 24;
        instructors = new String[]{"Nadir","Saim","Murodil"};
        schoolName = "Cydeo";
        myCoffee = new Coffee("Starbucks", 10);
    }

//    static {
//        batchNumber   = 25;
//        instructors   = new  String[] {"Nadir","Nadir"};
//        schoolName    = "Cydeo";
//    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
