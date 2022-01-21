package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		if (text1.length()==text2.length())
		{
			System.out.println("The size of the array is same");
		}
		
char[] ch = text1.toCharArray();
char[] ch1 = text2.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch1);
System.out.println(ch);
System.out.println(ch1);
/*boolean flag = Arrays.equals(ch, ch1);
System.out.println("The two arrays are equal" +flag);*/
	if(Arrays.equals(ch, ch1))
	{
		System.out.println("The given words are anagram");
	}
	else 
	{
		System.out.println("Not an anagram");
	}
	} 
	

}
