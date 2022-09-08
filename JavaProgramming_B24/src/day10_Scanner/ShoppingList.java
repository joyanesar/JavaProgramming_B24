package day10_Scanner;

import java.util.Scanner;

public class ShoppingList {
    /*
    Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
     */
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);


        String item1 ,item2,item3, report = " ";
        double price1,price2,price3,totalPrice =0;

        System.out.println("Enter Item 1 and its price");
        item1 = key.nextLine();
        price1 =key.nextDouble();
        totalPrice += price1;//Tomatoes Price: 5.5
        report += "item1" + item1 + " price : " + price1 + " , "; // report = report + apples >

        key.nextLine();

        System.out.println("Enter Item 2 and its price");
        item2 = key.nextLine();
        price2 =key.nextDouble();
        totalPrice += price2;//Item2: Cheese Price: 3.5,
        report += "item2 :" + item2 + " price " + price2 + " , " ;

        key.nextLine();

        System.out.println("Enter Item 3 and its price");
        item3 = key.nextLine();
        price3 =key.nextDouble();
        totalPrice += price3;//Item3: Apples Price: 6.3
        report += "item3 " + item3 + " price " + price3;

        System.out.println(report);
        System.out.println("Total price " + totalPrice);





    }
}
