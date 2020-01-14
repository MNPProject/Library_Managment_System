
public class Student {

	private String name;
	private int ID;
	private long contactNum;
	private String email;
	
	/**
	 * Constructor for the student
	 * @param name name of the student
	 * @param ID the student ID
	 * @param contactNum the student contact number
	 * @param email the student email addres
	 */
	public Student(String name, int ID, long contactNum, String email) {
		this.name = name;
		this.ID = ID;
		this.contactNum = contactNum;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
