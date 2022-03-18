package com.student.resultapp.model;

public class USER_SIGN_UP {

	private String name;
	private String email;
	private String mobilenumber;
	private String department;
	private String batch;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "USER_SIGN_UP [NAME=" + name + ", EMAIL=" + email + ", MOBILE NUMBER=" + mobilenumber + ", DEPARTMENT="
				+ department + ", BATCH=" + batch + "]";
	}

}