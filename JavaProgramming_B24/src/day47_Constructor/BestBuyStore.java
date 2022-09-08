package day47_Constructor;

public class BestBuyStore {


    public static void main(String[] args) {

        BestBuy storeOne = new BestBuy("Main street");

        BestBuy storeTwo = new BestBuy("Oak Drive");


        System.out.println(storeOne.location);
        System.out.println(storeTwo.location);

        //System.out.println(BestBuy.day);
//        System.out.println(storeOne.day);
//        System.out.println(storeTwo.day);

        BestBuy.day = "Sunday";
//        storeOne.day = "sunday";
//        storeTwo.day = "Sunday";

        System.out.println(BestBuy.day);
//        System.out.println(storeOne.day);
//        System.out.println(storeTwo.day);

        BestBuy.capacity = 300;
        System.out.println("Store One has " + storeOne.capacity + " Customers Capacity");
        BestBuy.capacity = 350;
        System.out.println("Store Two has " + storeTwo.capacity + " Customers Capacity");







    }
}
