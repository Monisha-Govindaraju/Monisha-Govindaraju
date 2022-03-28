package com.student.resultapp.dao.test;

import java.util.Scanner;

import com.student.resultapp.dao.LoginValidationDAO;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email ID:");
		String email = sc.next();
		System.out.println("Enter your password:");
		String password = sc.next();

		try {
			LoginValidationDAO.loginValidator(email, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
