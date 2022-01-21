package week3.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "$$ Welcome to 2nd Class of Automation $$";
int  letter = 0, space = 0, num = 0, specialChar = 0;
char[] ch=test.toCharArray();
for (int i=0;i<ch.length;i++)
{
	if(Character.isLetter(ch[i]))
	{
		letter++;
	}
	if(Character.isDigit(ch[i]))
	{
		num++;
	}
	if(Character.isSpaceChar(ch[i]))
	{
		space++;
	}
	else 
	{
		specialChar++;
	}
}
System.out.println("The Number of letters are " +letter);
System.out.println("The number of digits present are " +num);
System.out.println("The number of spaces are " +space);
System.out.println("The number of special characters are " +specialChar);
	}

}
