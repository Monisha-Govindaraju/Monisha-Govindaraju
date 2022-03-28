package com.student.resultapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.resultapp.model.ResultApp;

public class ResultDAO {

	public static List<ResultApp> findMyResult(String email) throws ClassNotFoundException, SQLException {
		List<ResultApp> list = new ArrayList<ResultApp>();
		Connection connection = ConnectionUtil.databaseConnection();
		PreparedStatement statement = null;
		ResultSet res = null;
		String query = "select * from student_resultapp_result where EMAIL=?";
		statement = connection.prepareStatement(query);
		statement.setString(1, email);
		res = statement.executeQuery();
		ResultApp resultApp = null;
		int regNo = 0;
		String dept = null;
		String sem = null;
		String sub1 = null;
		String sub2 = null;
		String sub3 = null;
		String sub4 = null;
		String sub5 = null;
		String sub6 = null;
		String result = null;
		int total = 0;
		while (res.next()) {
			resultApp = new ResultApp();
			regNo = res.getInt("REGISTER_NUMBER");
			dept = res.getString("DEPARTMENT");
			sem = res.getString("SEMESTER");
			sub1 = res.getString("SUBJECT_1");
			sub2 = res.getString("SUBJECT_2");
			sub3 = res.getString("SUBJECT_3");
			sub4 = res.getString("SUBJECT_4");
			sub5 = res.getString("SUBJECT_5");
			sub6 = res.getString("SUBJECT_6");
			result = res.getString("RESULT");
			total = res.getInt("TOTAL");
			resultApp.setRegisternumber(regNo);
			resultApp.setDepartment(dept);
			resultApp.setSemester(sem);
			resultApp.setSubject1(sub1);
			resultApp.setSubject2(sub2);
			resultApp.setSubject3(sub3);
			resultApp.setSubject4(sub4);
			resultApp.setSubject5(sub5);
			resultApp.setSubject6(sub6);
			resultApp.setResult(result);
			resultApp.setTotal(total);
			list.add(resultApp);
		}
		return list;
	}

}
