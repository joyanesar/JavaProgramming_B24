package Office_Hours;

public class CatAndDog {
    public static void main(String[] args) {
        // same number of cat and dogs
        String str = "catanddog";

        int cat = 0;
        int dog = 0;

        str.length();
        System.out.println(str.length());

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                cat++;


            }
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                dog++;

            }

        }
        System.out.println(cat==dog);
    }
}

