package day59_exceptions;

public class AllPeople {
    public static void main(String[] args) {


        Person ob = new Person();
        ob.setName("James");
        try {

            ob.setAge(40);
        }catch (Exception e){
            System.out.println("Age handled");
        }
        System.out.println(ob.getName());
        System.out.println(ob.getAge());
        try {


            ob.setAge(-20);
        }catch (Exception e){
            System.out.println("Invalid age");
        }
    }
}
