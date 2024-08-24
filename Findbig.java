package week1;
import java.util.Scanner;

public class Findbig {
	public static void main(String[] args)
	{
		int big, biggest;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 values: ");
		
		int[] value = new int[10];
		
		for (int i = 0 ; i < 10; i++)
		{
			value[i] = input.nextInt();
			
		}
		
		
		if (value[0] > value[1])
		{
			big = value[1];
			biggest = value[0];
		}
		else
		{
			big = value[0];
			biggest = value[1];
		}
		
		for(int i = 2; i < value.length; i++)
		{
			if(value[i] > biggest)
			{
				big = biggest;
				biggest = value[i];
			}
			else if (value[i] > big)
			{
				big = value[i];
			}
		
		
		}
		
		if(big == biggest)
		{
			System.out.println("The two largest values are equal, both are: " + biggest);
			
		}
		else
		{
			System.out.println("The largest value is " + biggest + " and the second largest is " + big);
			
		}
		input.close();
	}
		
}
