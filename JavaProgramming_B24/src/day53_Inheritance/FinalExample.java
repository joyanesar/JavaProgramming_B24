package day53_Inheritance;

public class FinalExample {

    final  int a; // final variable  can not be change
    public static final  String PLANET = "Earth";


    public FinalExample(int a){
        this.a = a;

    }

    public static void main(String[] args) {
        FinalExample obj = new FinalExample(5);

        System.out.println(obj.a);
      //  obj.a = 10; we can not change because its final variable

        //PLANET = "Mars";  cannot reassign to final variable
    }
}
