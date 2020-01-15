
public class Admin {
	private String name;		// admins name
	private String Password;	// admins password
	
	
	/**
	 * 
	 */
	public Admin() {
	}
	
	/**
	 * 
	 * @param name admins name
	 */
	public Admin(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 * @param password
	 * @param name
	 */
	public Admin(String password, String name) {
		super();
		Password = password;
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return Password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		Password = password;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
