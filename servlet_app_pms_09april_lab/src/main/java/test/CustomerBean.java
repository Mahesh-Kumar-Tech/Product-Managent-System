package test;

import java.io.*;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable{
	private String cUserName;
	private String cPassword;
	private String cFirstName;
	private String cLastName;
	private String cMailId;
	private long cPhNo;
	public CustomerBean() {
	}
	public String getcUserName() {
		return cUserName;
	}
	public void setcUserName(String cUserName) {
		this.cUserName = cUserName;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String getcFirstName() {
		return cFirstName;
	}
	public void setcFirstName(String cFirstName) {
		this.cFirstName = cFirstName;
	}
	public String getcLastName() {
		return cLastName;
	}
	public void setcLastName(String cLastName) {
		this.cLastName = cLastName;
	}
	public String getcMailId() {
		return cMailId;
	}
	public void setcMailId(String cMailId) {
		this.cMailId = cMailId;
	}
	public long getcPhNo() {
		return cPhNo;
	}
	public void setcPhNo(long cPhNo) {
		this.cPhNo = cPhNo;
	}

}
