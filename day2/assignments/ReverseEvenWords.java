package week3.day2.assignments;
import java.util.*;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] str = test.split("");
		
		for (int i=0; i<str.length; i++)
		{
			//System.out.print(str[i]);
			if (i%2==0)
			{
				System.out.print(str[i]);
				System.out.print(" ");
			}
			char reverse[]=str[i].toCharArray();
			for(int j=(reverse.length)-1;j>=0;j--)
			{
				System.out.print(reverse[j]);
			}
			System.out.print(" ");
		}
		
		
	}

}
