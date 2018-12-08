//7.2
package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab7_2 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Pen");
		al.add("Pencil");
		al.add("Bat");
		al.add("Ball");
		al.add("Wicket");
		al.add("Bails");
		System.out.println("Befor Sorting\n");
		for(String string : al)
		{
			System.out.println(string);
		}
		System.out.println("\nAfter sorting\n");
		Collections.sort(al);
		for(String string : al)
		{
			System.out.println(string);
		}
	}
}
