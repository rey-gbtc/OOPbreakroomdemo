
// access modifier (public), class keyword (class), name of class (start with capital letter, here it's 'Book').
public class Book {
    // class two things: things it has, things it can do
    private String title;
    private String author;
    private int publishYear;

    // default constructor (access modifier, name of class + parenthesis)
    public Book(){

    }

    // special constructor
    public Book(String title){
        this.title = title;
    }

    public Book(String title, String author, int publishYear){
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }
    // things it can do (methods)
    public void setTitle(String title){
        // in our example, this = book2
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }

    public int getPublishYear(){
        return publishYear;
    }




}
