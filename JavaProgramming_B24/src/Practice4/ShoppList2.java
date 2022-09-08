package Practice4;

import java.util.Scanner;

public class ShoppList2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String  item1,item2,item3,report = "";
        double price1,price2,price3,totalPrice = 0;

        System.out.println("Enter item1 and its price");
        item1 = scan.nextLine();
        price1 =scan.nextDouble();
        totalPrice += price1;
        report += "Item1: " + item1 + " price: " + price1 + ",";

        scan.nextLine();

        System.out.println("Enter item2 and its price");
        item2 = scan.nextLine();
        price2 = scan.nextDouble();
        totalPrice += price2;
        report +=  " Item2: " + item2 + " price: " + price2 + " ,";

        scan.nextLine();

        System.out.println("Enter item3 and its price");
        item3 = scan.nextLine();
        price3 =scan.nextDouble();
        totalPrice += price3;
        report += " Item3: " + item3 + " price: " + price3 +",";

        System.out.println(report);
        System.out.println(" Total price: " + totalPrice);
    }
}
