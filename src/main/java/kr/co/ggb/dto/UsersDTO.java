package kr.co.ggb.dto;

public class UsersDTO {
	private String usersId;
	private String password;
	private String usersName;
	private int phone;

	public UsersDTO() {
	}

	public UsersDTO(String usersId, String password, String users_name, int phone) {
		super();
		this.usersId = usersId;
		this.password = password;
		this.usersName = users_name;
		this.phone = phone;
	}

	public String getUsersId() {
		return usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
