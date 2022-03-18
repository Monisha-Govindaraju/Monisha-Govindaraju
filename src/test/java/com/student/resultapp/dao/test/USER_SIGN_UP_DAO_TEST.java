package com.student.resultapp.dao.test;

import com.student.resultapp.dao.USER_SIGN_UP_DAO;
import com.student.resultapp.model.USER_SIGN_UP;

public class USER_SIGN_UP_DAO_TEST {
	public static void main(String[] args) throws Exception {

		USER_SIGN_UP m1 = new USER_SIGN_UP();
		m1.setName("MONISHA");
		m1.setEmail("ahsinom105@gmail.com");
		m1.setMobilenumber("7708904929");
		m1.setDepartment("BME");
		m1.setBatch("2018-2022");
		System.out.println(m1);

		USER_SIGN_UP_DAO userdAO = new USER_SIGN_UP_DAO();
		userdAO.addResultApp(m1);
	}
}