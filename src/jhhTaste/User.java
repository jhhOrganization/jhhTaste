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

        public void setName(String)
        {
		this.name = name;
        }
        public void setEmail(String)
        {
		this.email = email;
        }
        public void setUserName(String)
        {
		this.userName = userName;
        }
        public void setPassword(String)
        {
		this.password = password;
        }
        public void setLoginStatus(String)
        {
		this.loginStatus = loginStatus;
        }

        public String getName()
        {
                return name;
        }
        public String getEmail()
        {
                return email;
        }
        public String getUserName()
        {
                return userName;
        }
        public String getPassword()
        {
                return password;
        }
        public String getLoginStatus()
        {
                return loginStatus;
        }
}
