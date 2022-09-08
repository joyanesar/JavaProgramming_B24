package day44_custom_classes;

public class wild {
    public static void main(String[] args) {

        Animal tiger = new Animal();
        tiger.species = "Tiger";
        tiger.size     = "Large";
        tiger.canFly   =  true;
        tiger.isMammal  = false;
        tiger.weight    = 200;

        tiger.eat();
        tiger.sleeping();

        new  Animal().eat();

        Animal panda = new Animal();
        panda.eat();
        panda.species = "panda";
        panda.eat();

    }
}
