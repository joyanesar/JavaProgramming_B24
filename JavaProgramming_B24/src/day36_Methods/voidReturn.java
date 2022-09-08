package day36_Methods;

public class voidReturn {
    public static void main(String[] args) {
        hellWorld();
        sayBye();
        System.out.println(sayBye());
       


    }

    public static void hellWorld(){
        System.out.println("Hello World");
        System.out.println("Hello People");

    }

    public static String sayBye(){
        return  "bye world";

    }
    public static void getReverse(){
        String str = "java";
        String revs = "";

        for(int i = str.length()-1; i >=0; i--){

            revs += str.charAt(i);
        }


    }

}
