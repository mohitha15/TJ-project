package controller;

import model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LibraryController {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean removeBook(final String isbn) {
        return books.removeIf(new Predicate<Book>() {
			public boolean test(Book book) {
				return book.getIsbn().equals(isbn);
			}
		});
    }
}
