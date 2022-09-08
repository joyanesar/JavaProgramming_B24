package Office_Hours;

public class SandWhich_Practice {
    public static void main(String[] args) {

        String str = "breadjam";

        int firstBread = str.indexOf("bread") ;
        int secondBread = str.lastIndexOf("bread");

        if(firstBread != secondBread) {
            System.out.println(str.substring(firstBread + 5, secondBread));
        }else {
            System.out.println("nothing");
        }
//        int secondBread = str.indexOf("bread" , firstBreadEnd);
//        //System.out.println(str.substring(firstBreadEnd,secondBread));
//
//        if(firstBreadEnd >= 0 && secondBread >=0){
//            System.out.println(str.substring(firstBreadEnd,secondBread));
//        }else {
//            System.out.println("nothing");
//        }
    }
}
