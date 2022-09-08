package Practice2;

public class GiftCard {
    public static void main(String[] args) {

        int giftBalance = 200;
        int item1Price  = 40;
        int item2Price  = 100;

        int remainingBalance = (giftBalance) - (item1Price+item2Price);
        System.out.println("The gift started with a balance of $"+giftBalance +" and after buying item 1 $"+item1Price + " and item 2 $"+item2Price+ ".The remaining balance is $"+remainingBalance+".");
    }
}
