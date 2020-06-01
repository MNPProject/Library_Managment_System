package app;

import java.io.Serializable;

/**
 * Book entity
 *
 */
public class Book implements Serializable{

	private String title;
	private String callNo;
	private String author;
	private String publisher;
	private int quantity;
	private int issued;
	/**
	 * @param title
	 * @param callNo
	 * @param author
	 * @param publisher
	 * @param quantity
	 */
	public Book(String title, String callNo, String author, String publisher, int quantity) {
		super();
		this.title = title;
		this.callNo = callNo;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the callNo
	 */
	public String getCallNo() {
		return callNo;
	}
	/**
	 * @param callNo the callNo to set
	 */
	public void setCallNo(String callNo) {
		this.callNo = callNo;
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
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void subQuantityBy1() {
		quantity -= 1 ;
	}
	
	public void addQuantity() {
		quantity += 1;
	}
	@Override
	public String toString() {
		return  " [TITLE = " + title + ", CALL_NUM = " + callNo + ", AUTHOR = " + author + ", PUBLISHER = " + publisher
				+ ", QUANTITY = " + quantity + ", ISSUED = " + issued + "]\n----------------------------------------------------------------------------------------------"
						+ "----------------\n";
	}
	
	/**
	 * @return the issued
	 */
	public int getIssued() {
		return issued;
	}
	/**
	 * @param issued the issued to set
	 */
	public void setIssued(int issued) {
		this.issued = issued;
	}
	
	public void addIssuedBook() {
		issued = issued + 1;
	}
	
	public void subIssuedBook() {
		issued -= 1;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((callNo == null) ? 0 : callNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (callNo == null) {
			if (other.callNo != null)
				return false;
		} else if (!callNo.equals(other.callNo))
			return false;
		return true;
	}
}
