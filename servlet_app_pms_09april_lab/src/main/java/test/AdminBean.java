package test;

import java.io.*;

@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	private String aFullName;
	private String aEmail;
	private long aPhoneNo;
	private String aPassword;
	private String aCPassword;
	
	public AdminBean() {
	}

	public String getaFullName() {
		return aFullName;
	}

	public void setaFullName(String aFullName) {
		this.aFullName = aFullName;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public long getaPhoneNo() {
		return aPhoneNo;
	}

	public void setaPhoneNo(long aPhoneNo) {
		this.aPhoneNo = aPhoneNo;
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}

	public String getaCPassword() {
		return aCPassword;
	}

	public void setaCPassword(String aCPassword) {
		this.aCPassword = aCPassword;
	}

	
}
