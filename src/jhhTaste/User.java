package jhhTaste;

public class User {
	private String name;
	private String email;
	private String userName;
	private String password;
	private String loginStatus;

	public boolean verifyLogin(){
		return true; //TODO
	}

	public User(String name, String email, String userName, String password,
			String loginStatus) {
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.loginStatus = loginStatus;
	}
}
