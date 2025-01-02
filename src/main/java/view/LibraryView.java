package view;

import model.Book;
import java.util.List;

public class LibraryView {
    public void displayMenu() {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Remove Book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\nBooks in Library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
