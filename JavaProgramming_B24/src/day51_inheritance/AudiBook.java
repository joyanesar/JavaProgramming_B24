package day51_inheritance;

public class   AudiBook extends Book {

    double duration;
    String narrator;

    public void listen(){
        System.out.println("listening to " + title + " narrated by " + narrator);
    }
}
// AudioBook is a Book