package jhhTaste;

import java.util.ArrayList;

public class Administrator extends User{

	private ArrayList<String> permissions;
	private ArrayList<String> role;

	public Administrator(String name, String email, String userName,
			String password, String loginStatus, ArrayList<String> permissions,
			ArrayList<String> role) {
		super(name, email, userName, password, loginStatus);
		this.permissions = permissions;
		this.role = role;
	}

	public boolean addRole(String role){
		return this.role.add(role);
	}

	public boolean removeRole(String role){
		return this.role.remove(role);
	}

	public boolean addPermission(String permission){
		return this.permissions.add(permission);
	}

	public boolean removePermission(String permission){
		return this.permissions.remove(permission);
	}

        public ArrayList<String> getPermissions()
        {
                return permissions;
        }

        public void setPermissions(ArrayList<String> permissions)
        {
                this.permissions = permissions;
        }

        public ArrayList<String> getRole()
        {
                return role;
        }

        public void setRole(ArrayList<String> role)
        {
                this.role = role;
        }
}
