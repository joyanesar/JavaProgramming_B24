package day09_Scanner_Logical;

public class EligibleToVote {
    public static void main(String[] args) {

        boolean isUSCitizen = true;
        int age = 30;
        boolean  hasCriminalBackGround = false;

        boolean isEligible = isUSCitizen && age >=18 && !hasCriminalBackGround;
        System.out.println(isEligible);

//        boolean isEligible =  isUSCitizen && age >=18;
//        System.out.println(isEligible);
    }
}
