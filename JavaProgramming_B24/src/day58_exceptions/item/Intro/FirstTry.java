package day58_exceptions.item.Intro;

public class FirstTry {

    public static void main(String[] args) {


        System.out.println("Fist line");

        try {
            String s = "Java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));
        }
        catch (StringIndexOutOfBoundsException e){ // e is just a name/reference
            System.out.println("We got exception");
            e.printStackTrace();

        }



        System.out.println("Last line");

    }

}
