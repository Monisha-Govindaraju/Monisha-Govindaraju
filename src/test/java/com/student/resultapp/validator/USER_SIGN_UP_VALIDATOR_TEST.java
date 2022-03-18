package com.student.resultapp.validator;

import com.student.resultapp.model.USER_SIGN_UP;

public class USER_SIGN_UP_VALIDATOR_TEST {

	public static void main(String[] args) throws Exception {
		USER_SIGN_UP m1 = new USER_SIGN_UP();
		m1.setName("MONISHA");
		m1.setEmail("ahsinom107@gmail.com");
		m1.setMobilenumber("7708904929");
		m1.setDepartment("BME");
		m1.setBatch("2018-2022");
		System.out.println(m1);
		USER_SIGN_UP_VALIDATOR.validateSignupDetails(m1);

	}

}
