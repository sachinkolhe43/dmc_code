package com.db.quote;
// first_name, last_name, email, passwd, mobile
public class UsersPojo {
	
	String fname;
	String lname;
	String email;
	String passwd;
	int mobile;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "UsersPojo [fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd
				+ ", mobile=" + mobile + "]";
	}
	
	
	
}
	
	
	
