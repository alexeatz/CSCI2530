package week1;

import java.util.Scanner;

public class w1_Assignment1 {



		
	
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		int[] data = {5, 7, 9, 11, 15};
		boolean found = false;
		
		System.out.println("Enter target value: ");
		int target = input.nextInt();
		input.close();
		
		for(int i = 1; i < data.length; i++)
		{
			
			for (int j = (i -1); j < i; j++)
			{
				
				int sum = data[i] + data[j];
				if (sum == target)
				{
					System.out.println( "Output: " + j + " " + i); 
					found = true;
					
				}

			}

		input.close();
	}
		
		if (!found)
		{
			System.out.print ("Target not located"); 
		}
		
			
	}
}
	
	




