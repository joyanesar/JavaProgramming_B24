package Tasks;

import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        String[] names={"jameka","michael","nadir"};


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name =input.next();


        String[] suject ={"java","sofSkill"};


        String longest = names[0];
        String smallest = names[0];

        for(String name1:names){

            if(name.length() < smallest.length()){
                smallest = name;

            }
            if(name.length() >longest.length()){
                longest = name;

            }
        }
        System.out.println("longest name is : " + longest);
        System.out.println("Smallest name is " + smallest);

        String bigOne = suject[0];
        String smallOne=suject[0];

        for(String sub:suject){
            if(sub.length() >bigOne.length()){
                bigOne = sub;
            }
            if(sub.length() < smallOne.length()){
                smallOne = sub;
            }
        }

//        System.out.println("sammlest " + smallOne);
//        System.out.println("BigOne " + bigOne);
    }

}
