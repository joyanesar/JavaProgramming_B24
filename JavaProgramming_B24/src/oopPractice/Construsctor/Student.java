package oopPractice.Construsctor;

public class Student {
    String name;
    int batchNumber;
    double grade;


   public String toString(){
      String s = "Student Information";
      s += "\nName " + name;
      s += "\nBatch: " + batchNumber;
      s += "\nGrade "  + grade;

      return s;
   }
}
