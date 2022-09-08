package oopPractice.Animal;

public class Animal {


    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
  ;

    //methods

    public void eat(){

        System.out.println(species + " is eating");
    }
    public void fly(){
        System.out.println(species + " can fly " );
    }

    public void sleeping(){
        System.out.println("This " + species + "  is sleeping all day ");
    }
    public void weighting(){

        System.out.println("This " + species  + " run all day");
    }

    public void roar(){
        System.out.println( species + "  is roaring ");
    }

    public void hunting(){

        System.out.println(species + " one of the best hunter");
    }
}
