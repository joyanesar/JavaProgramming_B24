package Office_Hours;

public class ArraySplitString {
    public static void main(String[] args) {

        String str = "Knife,wooden spoon,plates , cups , fork, pan, pot , trash can , fridge, dish washer , multiple word another word, home";


        String [] words = str.split(", ");

        for(String eachWord : words){
            if(!eachWord.equals(" ") && eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }

    }
}
