

public class Account {
	private String name;
	private String role;
	private String email;
	private String password;
	private String status;

	public Account(String name, String role, String email, String password) {
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.status = "new";
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void viewUser() {
		System.out.println(String.format("Name: %s\nRole: %s\nEmail: %s\nStatus: %s", name, role, email, status));
	}

}

