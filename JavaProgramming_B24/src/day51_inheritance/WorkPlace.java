package day51_inheritance;

public class WorkPlace {
    public static void main(String[] args) {


        Employee obj = new Employee();
        obj.name = "Saim";
        Tester obj1 = new Tester();
        obj1. name   = "Muradil";


        Developer obj2 = new Developer();
        obj2 . name = "Nadir";



        obj.work();
        obj1.work();
        obj2.work();


    }
}
