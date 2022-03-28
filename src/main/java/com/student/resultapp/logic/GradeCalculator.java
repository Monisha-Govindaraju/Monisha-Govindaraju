package com.student.resultapp.logic;

public class GradeCalculator {

	public static String findGrade(int subject1) {
		String grade = null;
		if (subject1 >= 0 && subject1 <= 100) {
			if (subject1 >= 90) 
			{
				grade = "O";
			} 
			else if (subject1 >= 60 && subject1 < 90) 
			{
				grade = "A";
			} else if (subject1 >= 35 && subject1 < 60) 
			{
				grade = "B";
			} else {
				grade = "U";
			}
		}
		return grade;
	}

}
