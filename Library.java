//Manages the collection of books in the library
import java.util.ArrayList;
public class Library {
    
    //Stores book objects in memory
    private ArrayList<Book> books=new ArrayList<>();

    //method to add a new book
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully");
    }

    //method to display all books
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No books available in the library");
            return;
        }
        else{
            for(Book book:books){
                book.displayBook();
                System.out.println("--------------------");
            }
        }
        
    }

    //method to update book details using isbn
    public void updateBook(String isbn,String newTitle,String newAuthor,int newYear){
        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setPublicationYear(newYear);
                System.out.println("Book updated successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    //method to delete book details using isbn
    public void deleteBook(String isbn){
        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                System.out.println("Book deleted successfully");
                return;
            }
            
        }
        System.out.println("Book not found");
    }

}
