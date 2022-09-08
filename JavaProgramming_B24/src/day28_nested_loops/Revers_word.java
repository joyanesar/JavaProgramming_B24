package day28_nested_loops;

public class Revers_word {

    public static void main(String[] args) {

        String s = "I love java";
        String fixedStr = "";
        String reverse = " ";
//        System.out.println(str.substring(0,1)+" " + str.charAt(5) + str.charAt(4) +
//                str.charAt(3) + str.charAt(2) + str.charAt(1) + str.substring(6));
        for (int i = s.length() -1 ; i>=0; i--) {

            //if (s.charAt(i) == ' ') {

            reverse+=s.charAt(i) + " ";

           }

        System.out.println(reverse);
        }
    }


//                for(int j=s.lastIndexOf(' '); j >=i; j--) {
//
//                    reverse += s.charAt(j);
//
//                }
//
//                fixedStr += reverse;
//                i = s.lastIndexOf(' ');
//
//            }else {
//                fixedStr += s.charAt(i);
//            }
//        }
//        System.out.println(fixedStr);
//    }
//}