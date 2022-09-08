package day07_unary_operators;

public class Store {
    public static void main(String[] args) {

        String storeName    = "Target";
        int     numberOfTvs = 100;



        System.out.println("person came in to the store bought a tv ");
        System.out.println("Number of Tvs now :" + --numberOfTvs);
        System.out.println("Number of Tvs now :" + --numberOfTvs);

        System.out.println("person came in to the store and put a tv in to the cart");
        System.out.println("Numbers of tvs in the store is still :" + numberOfTvs--);
        System.out.println("If they bought and left:"+numberOfTvs);

        System.out.println("Shipment of tvs comes :");
        numberOfTvs = numberOfTvs + 53;
//        numberOfTvs++;
//        numberOfTvs++;
//        // 47 more line
        System.out.println("number"+numberOfTvs);

        System.out.println("someone comes with big bucks buy 5 tvs");
        numberOfTvs = numberOfTvs -5;

    }
}
