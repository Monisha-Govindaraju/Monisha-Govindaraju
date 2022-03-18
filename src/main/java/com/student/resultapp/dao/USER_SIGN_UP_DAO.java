package com.student.resultapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.student.resultapp.model.USER_SIGN_UP;

public class USER_SIGN_UP_DAO {
	public void addResultApp(USER_SIGN_UP m1) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");

		String query = "INSERT INTO student_resultapp_users (NAME,email,mobile_number,department,batch) VALUES(?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, m1.getName());
		statement.setString(2, m1.getEmail());
		statement.setString(3, m1.getMobilenumber());
		statement.setString(4, m1.getDepartment());
		statement.setString(5, m1.getBatch());

		System.out.println(query);
		int row = statement.executeUpdate();
		System.out.println("No of rows inserted:" + row);

		statement.close();
		connection.close();
	}
}