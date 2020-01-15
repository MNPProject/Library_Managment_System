/**
 * Book entity
 * @author Gutama
 *
 */
public class Book {
	
	private String title;				// title of the book
	private String authorFirstName;		// authors first name
	private String authorLastName;		// authors last name
	private String ISBN;				// ISBN (International Standard Book Number)
	private String CallNum;				// call number (books address in the library)
	private String publisher;			// publisher of the book
	// private static int quantity;		// number of book
	
	
	/**
	 * 
	 * @param title
	 * @param callNum
	 */
	public Book(String title, String callNum) {
		super();
		this.title = title;
		CallNum = callNum;
	}

	/**
	 * 
	 * @param title
	 * @param authorFirstName
	 * @param authorLastName
	 * @param iSBN
	 * @param callNum
	 * @param publisher
	 * @param quantity
	 */
	public Book(String title, String authorFirstName, String authorLastName, String iSBN, String callNum,
			String publisher, int quantity) {
		super();
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		ISBN = iSBN;
		CallNum = callNum;
		this.publisher = publisher;
	//	this.quantity = quantity;
	}

	/**
	 * 
	 * @return title of the book
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 
	 * @return authors first name
	 */
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	
	/**
	 * 
	 * @param authorFirstName
	 */
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	
	/**
	 * 
	 * @return authors last name
	 */
	public String getAuthorLastName() {
		return authorLastName;
	}
	
	/**
	 * 
	 * @param authorLastName
	 */
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	/**
	 * 
	 * @return ISBN
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * 
	 * @param iSBN
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	/**
	 * 
	 * @return call number of the book
	 */
	public String getCallNum() {
		return CallNum;
	}
	
	/**
	 * 
	 * @param callNum
	 */
	public void setCallNum(String callNum) {
		CallNum = callNum;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
