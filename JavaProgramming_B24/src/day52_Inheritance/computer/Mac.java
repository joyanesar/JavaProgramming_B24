package day52_Inheritance.computer;

public class Mac extends Computer{

    public Mac(int memory){

        super(" Mac ", memory);
    }

    public String toString(){
        return  " OS : "   + os + " Memory " + memory;
    }
}
