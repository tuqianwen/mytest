package com.gdnf;

public class Users {

	private String uname;
	private int uage;
	
	public void userInfo(){
		System.out.println("用户名:"+uname+",年龄:"+uage);
	}
	
	public Users() {
	}
	public Users(String uname, int uage) {
		super();
		this.uname = uname;
		this.uage = uage;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	
	
	
}
