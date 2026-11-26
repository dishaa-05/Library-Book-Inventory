import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        //Repeats the menu until the user exits
        while (true) {
            System.out.println();
            System.out.println("----Library Management System----");
            System.out.println("1.Add Book");
            System.out.println("2.View Books");
            System.out.println("3.Update Book");
            System.out.println("4.Delete Book");
            System.out.println("5.Exit");
            System.out.println("---------------------------------");

            System.out.print("Enter Choice: ");
            String input = sc.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
                continue;
            }
            //Add a new book
            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = sc.nextLine();

                System.out.print("Enter author name: ");
                String author = sc.nextLine();

                System.out.print("Enter ISBN: ");
                String isbn = sc.nextLine();

                if (title.trim().isEmpty() || author.trim().isEmpty() || isbn.trim().isEmpty()) {
                    System.out.println("Title, author and ISBN cannot be empty");
                    continue;
                }

                System.out.print("Enter publication year: ");
                String yearInput = sc.nextLine();
                int year;
                try {
                    year = Integer.parseInt(yearInput);
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid year");
                    continue;
                }
                if(year<=0){
                    System.out.println("Publication year must be greater than 0");
                    continue;
                }
                Book book = new Book(title, author, isbn, year);
                library.addBook(book);
            } 
            //Display all books
            else if (choice == 2) {
                library.viewBooks();
            } 
            //Update an existing book
            else if (choice == 3) {
                System.out.print("Enter ISBN of book to update: ");
                String isbn = sc.nextLine();

                System.out.print("Enter new title: ");
                String newTitle = sc.nextLine();

                System.out.print("Enter new author: ");
                String newAuthor = sc.nextLine();

                if(isbn.trim().isEmpty()||newTitle.trim().isEmpty()||newAuthor.trim().isEmpty()){
                    System.out.println("ISBN, title and author cannot be empty");
                    continue;
                }

                System.out.print("Enter new publication year: ");
                String yearInput=sc.nextLine();
                int newYear;
                try{
                    newYear=Integer.parseInt(yearInput);
                }
                catch(NumberFormatException e){
                    System.out.println("Please enter a valid year");
                    continue;
                }
                if(newYear<=0){
                    System.out.println("Publication year must be greater than 0");
                    continue;
                }
                

                library.updateBook(isbn, newTitle, newAuthor, newYear);
            } 
            //Delete a book
            else if (choice == 4) {
                System.out.print("Enter ISBN of the book to delete: ");
                String isbn = sc.nextLine();
                library.deleteBook(isbn);
            } 
            //Exit the application
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }

}
