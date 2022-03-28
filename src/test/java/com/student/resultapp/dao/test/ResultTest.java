package com.student.resultapp.dao.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.student.resultapp.logic.ResultFinder;

public class ResultTest {

	public ResultTest() {

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email");
		String email = sc.next();
		ResultFinder.findResult(email);

	}
}
