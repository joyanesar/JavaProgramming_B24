package Repil_paractice1;

import java.util.Scanner;

public class VideoGames {
    public static void main(String[] args) {
        /*
        The video games machines at your local arcade outputs coupons according to how well you play the game.

You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
Write a program that displays how many candy bars and gumballs you can get. You perfer candy bars.

if you the coupons are not enough for any redeem, display message

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons");
        int  coupons = input.nextInt();
        int  numberOfCandyBars = input.nextInt();
        int numGumballs = input.nextInt();


        if(coupons >= 3){
            numberOfCandyBars = coupons / 10;
            numGumballs      = (coupons % 10) / 3;
            System.out.println("Number of candies " + numberOfCandyBars + "\nNumbers of Gumballs " + numGumballs);


        }else {
            System.out.println("Not enough coupons");
        }



    }
}
