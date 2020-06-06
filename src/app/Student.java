package app;


import java.io.Serializable;

public class Student implements Serializable {

	private String firstName;
	private String lastName;
	private String Id;
	private String contactNum;
	/**
	 * @param firstName first name
	 * @param lastName	last name
	 * @param id		student id
	 * @param contactNum student contact number
	 */
	public Student(String firstName, String lastName, String id, String contactNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		Id = id;
		this.contactNum = contactNum;
	}
	public Student() {}
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
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
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
		return "STUDENTFIRSTNAME = " + firstName + ", STUDENTLASTNAME = " + lastName + ", ID = " + Id + ", CONTANCTNUM = "
				+ contactNum + "\n---------------------------------------------------------------------------------"
						+ "---------------------------";
	}
	
	
}
