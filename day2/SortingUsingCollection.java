package week3.day2;

import java.awt.List;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"HCL", "Wipro","Aspire Systems","CTS"};
		int length = input.length;
		System.out.println("The length of the array is" +length);
		List<String> list=new Arraylist<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire Systems");
		list.add("CTS");
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
