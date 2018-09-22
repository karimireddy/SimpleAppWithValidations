package com.sampleapp.dto;

import java.util.Date;

import com.sampleapp.enums.Roles;

public class EmployeeDto {

	private String fName;
	private String mName;
	private String lName;
	private String email;
	private Roles role;
	private Date DOB;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "EmployeeDto [fName=" + fName + ", mName=" + mName + ", lName=" + lName + ", email=" + email + ", role="
				+ role + ", DOB=" + DOB + "]";
	}

}
