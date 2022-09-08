package day30_Arrays;

public class Prices {
    public static void main(String[] args) {

        double[] prices = {24.5,66.5,20.55,33.25};

        for (int i=0;i<prices.length;i++){
            System.out.println("prices $ " + prices[i]);

            for(double eachDouble:prices){
                System.out.println("$ " + eachDouble);
            }


        }


    }
}
