package src.beans;

public class Customer {
	private String id;
	private String name;
	private String email;
	private String password;
	
	public Customer(String id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getpassword() {
		return password;
	}
}