package com.sampleapp.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.sampleapp.enums.Roles;

public class EmployeeDto {

	@NotNull(message = "FirstName cannot be null")
	@NotBlank(message = "FirstName cannot be blank")
	private String fName;

	private String mName;

	@NotNull(message = "LastName cannot be null")
	@NotBlank(message = "LastName cannot be blank")
	private String lName;

	@NotNull(message = "Email cannot be null")
	@NotBlank(message = "Email cannot be blank")
	@Email(message = "Email is not in valid format")
	private String email;

	@NotNull(message = "Role cannot be null")
	@NotBlank(message = "Role cannot be blank")
	private Roles role;

	@NotNull(message = "DateOfBirth cannot be null")
	@NotBlank(message = "DateOfBirth cannot be blank")
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
