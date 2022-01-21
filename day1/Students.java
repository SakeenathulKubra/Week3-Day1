package week3.day1;

public class Students {
		public void getStudentInfo(int id) {
		System.out.println("The student id is " +id);
	}
public void getStudentInfo(int id, String name ) {
	System.out.println("The Student id is " +id);
	System.out.println("The student name is " +name);
}
public void getStudentInfo(String email, double num) {
	System.out.println("The Student mail is " +email);
	System.out.println("The phone number is "+num);
}
public static void main(String[] args) {
	Students s = new Students();
	s.getStudentInfo(12);
	s.getStudentInfo(25, "Kubra");
	s.getStudentInfo("kskazim@gmail.com", 945682137);
}
}
