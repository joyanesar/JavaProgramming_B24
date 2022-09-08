package day36_Methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();
        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println(score);
        hasGoodCreditScore(900);
        System.out.println(hasGoodCreditScore(900));

    }

    public static int getCreditScore(){

        return  800;
    }
    public static boolean hasGoodCreditScore(int score){

        if(score > 750) {
            return true;
        }else {
            return false;
        }
    }

}
