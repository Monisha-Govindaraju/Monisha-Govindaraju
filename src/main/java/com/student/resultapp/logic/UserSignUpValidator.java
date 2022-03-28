package com.student.resultapp.logic;

import com.student.resultapp.dao.UserSignUpDAO;
import com.student.resultapp.model.UserSignUp;

public class UserSignUpValidator {

	public static void validateSignupDetails(UserSignUp m1) throws Exception {
		if (m1.getName() != null) {
		} else {
			throw new Exception("The name cannot be empty");
		}
		if (m1.getEmail().contains("@") && m1.getEmail().contains(".com")) {
		} else {
			throw new Exception("Enter a valid email ID");
		}
		if (m1.getMobilenumber().length() == 10) {
		} else {
			throw new Exception("The mobile number should contain 10 digits");
		}
		if (m1.getDepartment() != null) {
		} else {
			throw new Exception("The department cannot be empty ");
		}
		if (m1.getBatch() != null) {
		} else {
			throw new Exception("The batch cannot be empty ");
		}
		if (m1.getPassword().length() > 8) {
		} else {
			throw new Exception("Enter a strong password");
		}
		System.out.println("You have signed up successfully");
		UserSignUpDAO.userInsertion(m1);

	}
}
