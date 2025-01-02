package main;

import controller.LibraryController;
import view.LibraryView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryController controller = new LibraryController();
        LibraryView view = new LibraryView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.nextLine();
                    controller.addBook(title, author, isbn);
                    view.displayMessage("Book added successfully!");
                    break;

                case 2:
                    view.displayBooks(controller.getBooks());
                    break;

                case 3:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    if (controller.removeBook(removeIsbn)) {
                        view.displayMessage("Book removed successfully!");
                    } else {
                        view.displayMessage("Book not found.");
                    }
                    break;

                case 4:
                    view.displayMessage("Exiting...");
                    return;

                default:
                    view.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}
