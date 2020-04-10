package app;

public class Admin {
	private String name;		// admins name
	private String password;	// admins password
	
	
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
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
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
