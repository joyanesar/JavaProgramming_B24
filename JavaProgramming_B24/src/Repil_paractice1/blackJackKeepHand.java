package Repil_paractice1;

import java.util.Scanner;

public class blackJackKeepHand {
    public static void main(String[] args) {
        /*3
        In blackjack after the player asks to keep the house 4 things may happen.

if the card total is bigger then 21 the player busts.

if the house score is bigger then the player, the player loses .

if the player score is equal to the house then they are a draw.

if the player score is bigger then the house the player wins.

player and house scores are represented by player and house int variables.

check them using ifs to determine the result.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int houseScore = input.nextInt();
        int playerScore = input.nextInt();

        String msg = "";

        int cardTotal = houseScore + playerScore;

        if(cardTotal > 21){
            msg = " player busts";
        }
        if(houseScore > playerScore){
            msg = " player loses";
        }else if(playerScore == houseScore){
            msg = "they are a draw";
        }else if (playerScore > houseScore){
            msg = "player wins";

        }
        System.out.println(msg);
    }
}
