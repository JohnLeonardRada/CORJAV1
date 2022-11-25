package model;

public class AdminBean {
	private String userAccount;
	private String pass;
	

	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


	//CONSTRUCTOR/S
	public AdminBean(String string, String string2) {	
		this.userAccount = "";
		this.pass = "";
	}
}