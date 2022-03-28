package com.student.resultapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.resultapp.logic.ResultInsertion;

public class LoginValidationDAO {

	public LoginValidationDAO() {
	}

	public static void main(String[] args) {

	}

	public static void loginValidator(String email, String password) throws Exception {
		Connection connection;
		PreparedStatement statement;
		ResultSet rs = null;
		connection = ConnectionUtil.databaseConnection();
		String query = "SELECT email,password FROM student_resultapp_users WHERE email=?";
		statement = connection.prepareStatement(query);
		statement.setString(1, email);
		rs = statement.executeQuery();
		String Email = null;
		String Password = null;
		while (rs.next()) {
			Email = rs.getString("email");
			Password = rs.getString("password");
		}
		if (Email == null) {
			throw new Exception("Invalid user");
		} else if (Password.equals(password)) {
			System.out.println("You have logged in successfully");
			ResultInsertion.getMarks();
		} else {
			throw new Exception("Invalid Credentials");
		}
	}
}
