package com.student.resultapp.logic;

import java.sql.SQLException;
import java.util.List;
import com.student.resultapp.dao.ResultDAO;
import com.student.resultapp.model.ResultApp;

public class ResultFinder {
	public static void findResult(String email) throws ClassNotFoundException, SQLException {
		List<ResultApp> list = ResultDAO.findMyResult(email);

		for (ResultApp result : list) {
			System.out.println("Register number : " + result.getRegisternumber());
			System.out.println("Department      : " + result.getDepartment());
			System.out.println("Semester        : " + result.getSemester());
			System.out.println("Subject 1       : " + result.getSubject1());
			System.out.println("Subject 2       : " + result.getSubject2());
			System.out.println("Subject 3       : " + result.getSubject2());
			System.out.println("Subject 4       : " + result.getSubject2());
			System.out.println("Subject 5       : " + result.getSubject2());
			System.out.println("Subject 6       : " + result.getSubject2());
			System.out.println("Total           : " + result.getTotal());
			System.out.println("Result          : " + result.getResult());
		}
	}
}
