import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b = new Book("Wind in the Willows", "Kenneth Graham", "J3923457230", 2.50);
        boolean success = library.addBook(b);
        if (!success) {
            System.out.println("The book was not added.");
        }
    }
}

class Library {
    final int MAX_BOOKS = 100;
    Book[] books = new Book[MAX_BOOKS];
    int bookCount = 0;

    boolean addBook(Book book) {
        if (bookCount == MAX_BOOKS) {
            return false;
        }
        else {
            books[bookCount] = book;
            bookCount += 1;
            return true;
        }
    }
}

class Book {
    String title;
    String author;
    String ISBN;
    double price;

    Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }
}
