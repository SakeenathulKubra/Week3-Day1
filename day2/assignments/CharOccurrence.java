package week3.day2.assignments;

public class CharOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Welcome to Chennai";
int count = 0;
char[] ch=str.toCharArray();
for (int i=0; i<ch.length; i++)
{
	if (ch[i] == 'n')
	{
		count++;
	}
}
System.out.println("The number of time e has been repeated is " +count);
	}

}
