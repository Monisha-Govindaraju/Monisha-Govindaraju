package com.student.resultapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student.resultapp.model.ResultApp;

public class ResultInsertionDAO {

	public static void insertResult(ResultApp result) throws SQLException, ClassNotFoundException {
		Connection connection = ConnectionUtil.databaseConnection();
		PreparedStatement statement = null;
		String query = "insert into student_resultapp_result(EMAIL,REGISTER_NUMBER,DEPARTMENT,SEMESTER,SUBJECT_1,SUBJECT_2,SUBJECT_3,SUBJECT_4,SUBJECT_5,SUBJECT_6,RESULT,TOTAL) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement1 = connection.prepareStatement(query);
		statement1.setString(1, result.getEmail());
		statement1.setDouble(2, result.getRegisternumber());
		statement1.setString(3, result.getDepartment());
		statement1.setString(4, result.getSemester());
		statement1.setString(5, result.getSubject1());
		statement1.setString(6, result.getSubject2());
		statement1.setString(7, result.getSubject3());
		statement1.setString(8, result.getSubject4());
		statement1.setString(9, result.getSubject5());
		statement1.setString(10, result.getSubject6());
		statement1.setString(11, result.getResult());
		statement1.setInt(12, result.getTotal());

		System.out.println(query);
		int row = statement1.executeUpdate();
		System.out.println("No of rows inserted:" + row);

		statement1.close();
		connection.close();
	}
}
