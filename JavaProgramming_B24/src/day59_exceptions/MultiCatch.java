package day59_exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiCatch {
    public static void main(String[] args) {

       try {
           System.out.println(25 % 10 );
           System.out.println(10 / 10);
           System.out.println(10 / 0);
           Thread.sleep(10);
       }catch (ArithmeticException e){
           System.out.println("Arithmetic handle ");
       }catch (RuntimeException e) {
           System.out.println("Handle Runtime block");
       }catch (Exception e){
           System.out.println("Handle generally");

       }
    }
}