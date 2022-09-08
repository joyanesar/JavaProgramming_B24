package day51_inheritance;

public class Library {
    public static void main(String[] args) {


        Book book = new Book();
        book.title = "James Bond";

        //Book reference has access to 6 instance variables which were made in the book class

        EBook book1 = new EBook();
        book1.title = "Mindset";
        book1.size = 50;
        // book1 reference has access to 8 instance variables. 6 from the Book class and 2 from EBook class.

        book1.read();

        AudiBook book2 = new AudiBook();
        book2.title = "Leaders eat last";
        book2.narrator = "James Bond";
        book2.duration = 25;
        //book 2 reference has access to 8 instance variables . 6 from the Book class and 2 from the Audio book
        // book 2 . read(); not read method in AudioBook
        book2.listen();


    }
}
