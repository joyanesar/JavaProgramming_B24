package Office_Hours_phone;

public class Iphone extends Phone implements AppleApp{


    public Iphone(String model, double price, int size){
        super("Iphone", model, price,size);
    }
    @Override
    public void faceTime() {
        System.out.println("Iphone make facetime");

    }

    @Override
    public void calling() {
        System.out.println("Iphone calling");

    }

    @Override
    public void texting() {
        System.out.println("Iphone can texting");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
Create a class named iPhone that will be the subclass of Phone. Also implement the AppleApps interface
    implement all abstract methods
 */