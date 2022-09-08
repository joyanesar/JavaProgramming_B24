package day34_Methods;
 // this method prints hello world
public class MyFirstMethod {

    public static void helloWord(){  // this is custom method type

        System.out.println("Hello World");
    }

    public static void helloWord50Times(){

        for (int i=0; i <50; i++){
            System.out.println("Hello World");
        }
    }
    // the main is used to call our method
    public static void main(String[] args) {

        helloWord(); // after made method then we call it
        helloWord();

        helloWord50Times();

        System.out.println();

        helloWord50Times();

        for(int i=0; i < 50; i++){ // if I want to run my method for 50 times
            helloWord();


        }


    }
}
