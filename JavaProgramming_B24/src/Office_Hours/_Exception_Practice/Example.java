package Office_Hours._Exception_Practice;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(4000);
        try {


            String s = "java";
            s.charAt(100);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String exception caught");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Parent catches");


        }
    /*
    checked: child of exception class
    must be handled during compiling, before the program

    unchecked:child of Run timeException class
    does not need to be handled during compiling, but can
    be normally occur during exception, and usually because of logical
    or technical issue
     */

    }
}
