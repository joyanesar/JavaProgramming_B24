package day15_statements;

public class BreakStatement {
    public static void main(String[] args) {

        int i = 9;

        switch (i){

            case 8:
                System.out.println(8);
                break;
            default:
                System.out.println("default");
            case 10:
                System.out.println(9);
                break;
            case 11:
                System.out.println(10);
                break;

        }



    }
}
