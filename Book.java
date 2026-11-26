//Represents the book in the library
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;

    //constructor to initialize book details
    public Book(String title,String author,String isbn,int publicationYear){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.publicationYear=publicationYear;
    }
    
    //setter methods
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }

    //getter methods
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getPublicationYear(){
        return publicationYear;
    }

    //method to display book details
    public void displayBook(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("ISBN : "+isbn);
        System.out.println("Publication Year : "+publicationYear);
    }
    
}
