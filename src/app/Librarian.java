package app;


import java.io.Serializable;

public class Librarian implements Serializable {

	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private String city;
	private String contactNum;
	private int ID;
	/**
<<<<<<< HEAD:src/app/Librarian.java
	 * Construct a librarian using the specified field
	 * 
	 * @param name       name of the librarian
	 * @param password   librarian password
	 * @param email      librarian email
	 * @param address    librarian address
	 * @param city       librarian city
	 * @param ID         librarian address
	 * @param contactNum librarian contact number
=======
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param address
	 * @param city
	 * @param contactNum
>>>>>>> master:src/Librarian.java
	 */
	public Librarian(String firstName, String lastName, String email, String address, String city, String contactNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.city = city;
		this.contactNum = contactNum;
	}

	public int getId() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the contactNum
	 */
	public String getContactNum() {
		return contactNum;
	}
	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	
	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + ", city=" + city + ", contactNum=" + contactNum + "]";
	}

	
}
