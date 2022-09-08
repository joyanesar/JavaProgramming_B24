package Office_Hours;

public class DifferentLengthSustirn {
    public static void main(String[] args) {

        String s = "mouse";
        String s1 = "cat";
        String msg = "mouseababccatmouseabcdefcat";

        int counterOne = 0;
        int counterTwo = 0;

        for (int i = 0; i < msg.length(); i++) {


            if (i <= msg.length() -  s.length() &&msg.substring(i, i + s.length()).equals(s)) {
                counterOne++;


            }
            if (i <= msg.length() - s1.length() && msg.substring(i, i + s1.length()).equals(s1)) {
                counterTwo++;

            }

        }
        System.out.println(counterOne == counterTwo);
    }
}
