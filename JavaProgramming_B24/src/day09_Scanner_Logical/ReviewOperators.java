package day09_Scanner_Logical;

public class ReviewOperators {
    public static void main(String[] args) {

        double budget = 1000;


        budget  -= 200;

        boolean stillInBudget = budget >= 0;
        System.out.println("Budget After purchase :" + budget);

        System.out.println("Still In Budget " +stillInBudget);


        budget -=500;
        stillInBudget = budget >= 0;
        System.out.println("Budget After purchase :" + budget);

        System.out.println("Still In Budget " +stillInBudget);


        System.out.println(budget !=300); // 300 != 300
        System.out.println(budget !=300.5); // 300.5 -> true

        System.out.println(budget -- == 300);
        System.out.println(--budget == 299);
        System.out.println(budget++ == 299);

        int i = 5;
        boolean b = (i =3) == 5;// 3 ==5
        System.out.println(b);
        System.out.println(i);
        System.out.println(false == !true);
        System.out.println(false != true);


    }
}
