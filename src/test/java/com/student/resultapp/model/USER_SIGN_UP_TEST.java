package com.student.resultapp.model;

public class USER_SIGN_UP_TEST {

	public static void main(String[] args) {
		USER_SIGN_UP m1 = new USER_SIGN_UP("MONISHA", "ahsinom107@gmail.com", "7708904929", "BME", "2018-2022");
		System.out.println(m1);
		System.out.println("NAME:" + m1.name + ",EMAIL:" + m1.email + ",MOBILE NUMBER:" + m1.mobile_number
				+ ",DEPARTMENT:" + m1.department + ",BATCH:" + m1.batch);
	}

}
