package day12_IfStatements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
/*
add a new class ChooseLanguage
add main method
"Choose your language"
int selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk in english, hello
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your language, pick the number you want");
        System.out.println("\t1)English\n\t2)Spanish\n\t3)Turkish\n\t4)Russian\n\t5)French");
        int selection = scan.nextInt();
        String message = "";
        if (selection == 1) {
            System.out.println("hello, thank for your call");

        }else if(selection == 2){
            System.out.println("hola, gracias para llamar");
        }else if(selection == 3){
            System.out.println("\"merhaba, aradiginiz icin tesekkurler\"");
        }else if(selection == 4){
            System.out.println("privet, spasibo za vash zvonok\"");
        }else if(selection == 5 ){
            System.out.println("\"Merci ,pour votre appel\"");
        }else {
            System.out.println("\"lets talk in english, hello");
        }


    }
}
