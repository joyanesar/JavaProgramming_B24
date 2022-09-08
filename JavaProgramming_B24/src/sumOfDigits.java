import javax.xml.stream.events.Characters;

public class sumOfDigits {
    public static int sumOfStringDigits(String str){

        int count =0;

        for(int i =0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i))){

                count +=Integer.parseInt(""+ str.charAt(i));

            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(sumOfStringDigits("1234"));
    }
}
