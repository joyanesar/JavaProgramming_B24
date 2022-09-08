package Office_Hours;
import java.util.Scanner;
public class PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  //
        System.out.println("enter");
        String str = scan.next(); // abXYabc
        int n = scan.nextInt(); // 2

        String prefix = str.substring(0,n);
        String remaining = str.substring(n);


        System.out.println(remaining.contains(prefix));



    }

}
