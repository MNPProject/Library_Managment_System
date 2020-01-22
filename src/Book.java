public class Book {
	private String name, author, publisher;// holds the title, the writer, and the publisher of the book
	private String quantity; // holds how many books this title are available in library 
	private String issued; // holds the number of books of the same title token by students
	private String call_No; // holds the code where you can find the book in the library 

	public Book(String name, String author, String publisher, String quantity, String call_NO ) {
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		this.call_No=call_NO;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the issued
	 */
	public String getIssued() {
		return issued;
	}

	/**
	 * @param issued the issued to set
	 */
	public void setIssued(String issued) {
		this.issued = issued;
	}

	/**
	 * @return the call_No
	 */
	public String getCall_No() {
		return call_No;
	}

	/**
	 * @param call_No the call_No to set
	 */
	public void setCall_No(String call_No) {
		this.call_No = call_No;
	}
	
	
}
