
public class Librarian {

	private String name, password, email, address, city;
	private long ID, contactNum;

	/**
	 * Construct a librarian using the specfied field
	 * 
	 * @param name       name of the librarian
	 * @param password   librarian password
	 * @param email      librarian email
	 * @param address    librarian address
	 * @param city       librarian city
	 * @param ID         librarian address
	 * @param contactNum librarian contact number
	 */
	public Librarian(String name, String password, String email, String address, String city, long ID,
			long contactNum) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.city = city;
		this.ID = ID;
		this.contactNum = contactNum;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the iD
	 */
	public long getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(long iD) {
		ID = iD;
	}

	/**
	 * @return the contactNum
	 */
	public long getContactNum() {
		return contactNum;
	}

	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

}
