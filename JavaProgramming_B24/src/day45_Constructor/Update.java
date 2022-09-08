package day45_Constructor;


public class Update {
    public static void main(String[] args) {



        App  google = new App();

        google .name = "Google";
        google.isFree = true;
        google.version = 4.0;





        App firstApp= new App();
        firstApp.name = "Iphone13";
        firstApp.version = 12.5;
        firstApp.isFree = false;



        App secondApp = new App();
        secondApp.name = "facebook";
        secondApp.version = 9.7;
        secondApp.isFree = true;



        App thirdApp = new App();
        thirdApp.name = "instagram";
        thirdApp.version = 8.5;
        thirdApp.isFree = false;


        firstApp.update();
        System.out.println();

        secondApp.update();
        System.out.println();

        System.out.println();
        thirdApp.update();

        System.out.println(firstApp); // this line is trying to print out object but gives memory location

        System.out.println("Lates " + google.name + " is on the site " );
        System.out.println( " Its hase the latest  version " + google.version);
        System.out.println(google.isFree ? "App is free" : "App cost some money");




    }
}
