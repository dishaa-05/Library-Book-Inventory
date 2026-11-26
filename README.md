# Library Book Inventory Management

## Project Description

The Library Book Inventory Management System is a command-line program developed using Java. It allows users to manage books in the library. It supports adding new books, viewing all available books, updating book details, and deleting books using their ISBN.

The book details are stored in an ArrayList during program execution. Therefore, the information is not stored permanently.

## Features

- Add new books
- View all books
- Update book details using ISBN
- Delete books using ISBN
- Validate user inputs
- Handle invalid numeric inputs using exception handling
- Display appropriate messages for successful and unsuccessful operations

## Book Details

Each book contains the following information:

- Title
- Author
- ISBN
- Publication Year

## Technologies Used

- Java
- ArrayList
- Scanner
- Exception Handling

## Project Files

- `Book.java`: Represents a book and stores its details.
- `Library.java`: Manages the book collection and performs CRUD operations.
- `Main.java`: Contains the menu-driven application and handles user input.

## How to Compile

Open a terminal in the project folder and run:

```bash
javac Book.java Library.java Main.java
```

## How to Run

After compiling, run:

```bash
java Main
```