package entity;

public class User {

	private String idU;
	private String username;
	private String password;
	
	
	public User(String idU, String username, String password) {
		super();
		this.idU = idU;
		this.username = username;
		this.password = password;
	}


	public String getIdU() {
		return idU;
	}


	public void setIdU(String idU) {
		this.idU = idU;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [idU=" + idU + ", username=" 
				+ username + ", password=" + password + "]";
	}
	
	
}
