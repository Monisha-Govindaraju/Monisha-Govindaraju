package com.student.resultapp.validator;

import com.student.resultapp.model.USER_SIGN_UP;

public class USER_SIGN_UP_VALIDATOR {

	public static void validateSignupDetails(USER_SIGN_UP m1) throws Exception {
		if (m1.getName() == null) {
			throw new Exception("The username can not be empty");
		} 
		else if (m1.getEmail() == null) {
			throw new Exception("The email can not be empty");
		} 
		else if (m1.getMobilenumber() == null) {
			throw new Exception("The mobile number can not be empty");
		} 
		else if (m1.getMobilenumber().length() == 9) {
			throw new Exception("Mobile number should contain 10 digits");
		} 
		else if (m1.getDepartment() == null) {
			throw new Exception("The name of the department can not be empty");
		} 
		else if (m1.getBatch() == null) {
			throw new Exception("The year of batch can not be empty");
		}
		System.out.println("You have signed up successfully");
	}
}
