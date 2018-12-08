package lab7;

import java.util.Arrays;

public class Lab7_1 {

	public static void main(String[] args)
	{
		String arr[] = new String[] {"Bat","Ball","Wicket","Bails","Pad"};
		System.out.println("Before sorting\n");
		for(String string:arr)
		{
			System.out.println(string);
		}
		
		Arrays.sort(arr);
		
		System.out.println("\nAfter sorting\n");
		for(String string:arr)
		{
			System.out.println(string);
		}
	}

}
