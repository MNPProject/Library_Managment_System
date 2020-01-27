

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LibrarianManager {

	private Map<String, Book> bookStore = new HashMap<>();
	private Map<String, Student> studentRent = new HashMap<>();

	/**
	 * Adds book to the bookStore. First it checks if the book has already existed
	 * in the bookStore. if exist, it adds the quantity of the book if not exist,
	 * adds the book to bookStore, and return the book
	 * 
	 * @param title     the book title
	 * @param callNo    the book callNo
	 * @param author    the book's author
	 * @param publisher book publisher
	 * @param quantity  number of books
	 * @return the book that is added
	 */
	public Book addBook(String title, String callNo, String author, String publisher, int quantity) {
		Book book = new Book(title, callNo, author, publisher, quantity); // create a book obj

		// if the bookStore contains the book
		// get the book quantity maped to the callNo and add the new quantity to the
		// book quantity
		// add the new quantity to the book obj
		if (bookStore.containsKey(callNo)) {
			int bookQuantity = bookStore.get(callNo).getQuantity() + quantity;
			bookStore.get(callNo).setQuantity(bookQuantity);
			return bookStore.get(callNo);
		} else
			bookStore.put(callNo, book);

		return book;
	}

	/**
	 * Issues a book to a student. if the book does not exist, it throws
	 * BookNotFoundException updates the quantity and the issued filed in the book
	 * class
	 * 
	 * @param callNo
	 * @param studentFName
	 * @param studentLname
	 * @param studentId
	 * @param contactNum
	 * @return
	 * @throws BookNotFoundException
	 */
	public Book issueBook(String callNo, String studentFName, String studentLname, String studentId, String contactNum)
			throws BookNotFoundException {
		Book book = bookStore.get(callNo); // get the book that is going to be issued
		if (!bookStore.containsKey(callNo))
			throw new BookNotFoundException();
		if (book.getQuantity() == 0)
			throw new BookNotFoundException(book);
		Student student = new Student(studentFName, studentLname, studentId, contactNum);
		book.addIssuedBook(); // adds 1 to the issued field of this book
		book.subQuantityBy1(); // subtracts 1 from the quantity field in this book
		studentRent.put(callNo, student); // map the callNo to the student the book is issued to
		return book; // return the issued book
	}

	/**
	 * 
	 * @param bookNo the book's book number
	 * @param Id     the student Id
	 * @return true if the book is returned or false if not
	 */
	public boolean returnBook(String bookNo, String Id) {
		Student student = studentRent.get(bookNo);
		if (Id.equals(student.getId())) {
			Book book = bookStore.get(bookNo);
			book.subIssuedBook();
			book.addQuantity();
			return true;
		}
		return false;
	}

	/**
	 * prints out all the books available in the bookStore
	 */
	public void viewBook() {
		Collection<Book> books = bookStore.values(); // get all the values(books) from the hashmap
		for (Book bookList : books) // iterate through the books and
			System.out.println(bookList); // print each book
	}

	/**
	 * prints out issued books and the students who rent it.
	 */
	public void viewIssuedBook() {
		Set<String> callNoSet = studentRent.keySet(); // get the books call number
		for (String callNo : callNoSet) // Iterate through the callNo
			System.out.println("Call_Num = " + callNo + ", " + studentRent.get(callNo)); // prints out the students info
	}
}
