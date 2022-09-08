package day53_Inheritance.Rules;

public class C extends A{

  // @Override
    public int getNum(){
       return 6;
   }
   //getNum method cannot change access modifier beacuse it is public and they can only be made more accessible in overriding
   @Override

    public String getName(){
       return "str";
   }
   //getName mehtod can be changed to protected, or public access because they are mote accessible or can stay default(same);
}
