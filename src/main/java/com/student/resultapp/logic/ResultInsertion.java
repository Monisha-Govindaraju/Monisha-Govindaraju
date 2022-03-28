package com.student.resultapp.logic;

import java.sql.SQLException;
import java.util.Scanner;

import com.student.resultapp.dao.ResultInsertionDAO;
import com.student.resultapp.model.ResultApp;

public class ResultInsertion {
	public static void getMarks() throws ClassNotFoundException, SQLException {
		ResultApp result = new ResultApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email ID:");
		String email = sc.next();
		System.out.println("Enter the register number:");
		int registerNumber = sc.nextInt();
		System.out.println("Enter the department:");
		String dept = sc.next();
		System.out.println("Enter the semester:");
		String semester = sc.next();
		System.out.println("Enter the first subject mark:");
		int sub1 = sc.nextInt();
		System.out.println("Enter the second subject mark:");
		int sub2 = sc.nextInt();
		System.out.println("Enter the third subject mark:");
		int sub3 = sc.nextInt();
		System.out.println("Enter the fourth subject mark:");
		int sub4 = sc.nextInt();
		System.out.println("Enter the fifth subject mark:");
		int sub5 = sc.nextInt();
		System.out.println("Enter the sixth subject mark:");
		int sub6 = sc.nextInt();
		int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		String subject1 = GradeCalculator.findGrade(sub1);
		String subject2 = GradeCalculator.findGrade(sub2);
		String subject3 = GradeCalculator.findGrade(sub3);
		String subject4 = GradeCalculator.findGrade(sub4);
		String subject5 = GradeCalculator.findGrade(sub5);
		String subject6 = GradeCalculator.findGrade(sub6);

		result.setEmail(email);
		result.setRegisternumber(registerNumber);
		result.setDepartment(dept);
		result.setSemester(semester);
		result.setTotal(total);
		result.setSubject1(subject1);
		result.setSubject2(subject2);
		result.setSubject3(subject3);
		result.setSubject4(subject4);
		result.setSubject5(subject5);
		result.setSubject6(subject6);
		ResultInsertionDAO.insertResult(result);

	}

}
