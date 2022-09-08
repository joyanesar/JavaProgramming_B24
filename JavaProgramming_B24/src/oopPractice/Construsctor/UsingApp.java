package oopPractice.Construsctor;

public class UsingApp {
    public static void main(String[] args) {

        App obj = new App();
        obj.name = "java";
        obj.version = 9.12;
        obj.isFree = true;
        obj.update();
        System.out.println(obj.name);
        System.out.println(obj.isFree);
        System.out.println(obj.version);

        App obj1 = new App();
        obj1 .name = "windows";
        obj1.isFree = false;
        obj1.version = 10.15;
        obj1.update();
        System.out.println("Latest version of " + obj1.name + " " +  obj1.version);


    }
}
