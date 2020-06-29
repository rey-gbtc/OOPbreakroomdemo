import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Book() is an example of a default constructor.
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setAuthor("JK Rowling");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());

        // create second book
        Book book2 = new Book();
        book2.setTitle("Not Harry Potter");
        System.out.println(book2.getTitle());


        Book book3 = new Book();
        book3.setTitle("Now I have a title");

        Book book4 = new Book("I also have a title");
        System.out.println(book4.getTitle());


        Book book5 = new Book("Java 101 Book", "Sue Han", 2019);

        System.out.println("This book's title is " + book5.getTitle());
        System.out.println("This book's author is " + book5.getAuthor());
        System.out.println("This book was published in " + book5.getPublishYear());
    }
}
