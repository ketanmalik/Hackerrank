import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudent {
	/*
	 * HackerLand University has the following grading policy:
	 * 
	 * Every student receives a grade in the inclusive range from 0 to 100. Any
	 * grade less than 40 is a failing grade. Sam is a professor at the university
	 * and likes to round each student's grade according to these rules:
	 * 
	 * If the difference between the grade and the next multiple of 5 is less than
	 * 3, round up to the next multiple of 5. If the value of grade is less than 38,
	 * no rounding occurs as the result will still be a failing grade. For example,
	 * grade = 84 will be rounded to 85 but grade = 29 will not be rounded because
	 * the rounding would result in a number that is less than 40.
	 * 
	 * Given the initial value of for each of Sam's students, write code to automate
	 * the rounding process.
	 * 
	 * @author ketanmalik May 14 2020
	 */

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		System.out.println(gradingStudents(grades));
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		return grades.stream().map(x -> x >= 38 ? 5 - (x % 5) < 3 ? x + (5 - (x % 5)) : x : x)
				.collect(Collectors.toList());

		// List<Integer> res = new ArrayList<>();
		// for(int i=0; i<grades.size();i++){
		// int grade = grades.get(i);
		// if(grade >= 38){
		// int diff = 5 - (grade % 5);
		// if(diff < 3){
		// grade = grade + diff;
		// }
		// }
		// res.add(grade);
		// }
		// return res;
	}
}
