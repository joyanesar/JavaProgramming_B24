package day52_Inheritance;

public class Student extends Person{

    String schoolName;

   public Student(String name, int age, int birthYear, String schoolName) {
    super(name,age,birthYear); // instead of using method  we called by using super method
    this.schoolName = schoolName;


   }
   public void study(){
       System.out.println(name + " is studying  at " + schoolName);
    }
}
