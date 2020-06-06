package app;


import java.io.Serializable;

public class BookNotFoundException extends Exception {

	public BookNotFoundException() {
		System.out.println("Error, The book you are trying to issue does not exist");
	}
	
	public BookNotFoundException(Book book) {
		System.out.println("Error, \"" + book.getTitle() + "\" book has 0 quantity. Try again later");
	}
}
