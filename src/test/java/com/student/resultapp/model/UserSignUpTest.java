package com.student.resultapp.model;

import java.util.Scanner;

import com.student.resultapp.logic.UserSignUpValidator;

public class UserSignUpTest {

	public static void main(String[] args) {
		UserSignUp m1 = new UserSignUp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your email:");
		String email = sc.next();
		System.out.println("Enter your mobile number:");
		String mobilenumber = sc.next();
		System.out.println("Enter your department:");
		String department = sc.next();
		System.out.println("Enter your batch:");
		String batch = sc.next();
		System.out.println("Enter your password:");
		String password = sc.next();
		m1.setName(name);
		m1.setEmail(email);
		m1.setMobilenumber(mobilenumber);
		m1.setDepartment(department);
		m1.setBatch(batch);
		m1.setPassword(password);
		try {
			UserSignUpValidator.validateSignupDetails(m1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
