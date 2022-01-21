package week3.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		String A ="madam";
		String rev = "";
		char a;
		int size=A.length();
		for(int i=size-1; i>=0; i--)
		{
			a=A.charAt(i);
			rev = rev + a; 
			
					}
		System.out.println("The reversed string is " +rev);
		if(rev.equals(A)) {
			System.out.println("The given string is Palindrome");
		}
		else {System.out.println("The given string is not a Palidrome");
	}
}
}
