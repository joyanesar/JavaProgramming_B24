package Tasks;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade");

        int grade = input.nextInt();
        String outPut = "";


        if (grade > 90) {
            outPut = "excellent";

        } else if (grade > 70 && grade < 90) {
            outPut = "good";

        } else if (grade > 60 && grade < 70) {
            outPut = " pass";

        } else if (grade < 60) {
            outPut = "fail";
        }
        System.out.println(outPut);
    }


}

