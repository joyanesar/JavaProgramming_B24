package day47_Constructor;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone = new Iphone("ProMax", 1500);
        System.out.println(phone);


       Iphone phone1 = new Iphone("10","white",1000, 250);

       Iphone phone2 = new Iphone("13", "black", 1200, 700);

        System.out.println(phone);
        System.out.println(phone2);


        System.out.println(Iphone.brand);
        System.out.println(Iphone.operatingSystem);
    

    }
}
