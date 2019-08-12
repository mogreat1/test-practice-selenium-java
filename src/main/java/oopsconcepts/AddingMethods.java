package oopsconcepts;

public class AddingMethods {

	public static void main(String[] args) {

		displayGradres("Tom", findGrades(90));
		displayGradres("Ann", findGrades(60));

	}

	public static String findGrades(int score) {

		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 70 && score < 80) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;

	}

	public static void displayGradres(String studentName, String grade) {
		System.out.println(studentName + " has got  " + grade);
	}

}
