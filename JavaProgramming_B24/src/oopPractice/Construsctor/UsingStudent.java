package oopPractice.Construsctor;

public class UsingStudent {
    public static void main(String[] args) {

        Student studentOne = new Student();
        studentOne.name = "James";
        studentOne.batchNumber = 24;
        studentOne.grade = 95;
        studentOne.name = "sam";
        System.out.println(studentOne);

        Student studentTwo = new Student();
        studentTwo.name = "ALi";
        studentTwo.batchNumber =3;
        studentTwo.grade =100;
        System.out.println(studentTwo);

    }
}
