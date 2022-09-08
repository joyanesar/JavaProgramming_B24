package day58_exceptions.item.animal;

public class Panda extends Animal{


    @Override
    public Panda getAnimal(){
        return  new Panda();
    }
}
