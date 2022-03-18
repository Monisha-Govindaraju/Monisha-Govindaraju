package com.student.resultapp.dao;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.student.resultapp.model.USER_SIGN_UP;
public class USER_SIGN_UP_DAO_IMPL implements USER_SIGN_UP_DAO {
public void register (USER_SIGN_UP m1)throws ClassNotFoundException,SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://101.53.133.59:3306/revature_training_db";
	String username="rev_user";
	String password="rev_user";
	DriverManager.getConnection(url,username,password);
}
}
