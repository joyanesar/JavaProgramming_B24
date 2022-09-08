package day19_string;

public class LastIndex {
    public static void main(String[] args) {

        // indexOf (0 - > first occurrence
        // lastIndexOf() -> las occurrence

        String  str = "java";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.indexOf('v'));
        System.out.println(str.lastIndexOf('v'));

        System.out.println(str.charAt(str.length()-1));
     }
}

