package week1;
import java.util.Scanner;
public class w2_Assignment2 {	
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("input three words: ");
	String[] words = new String[3];
	StringBuilder prefix = new StringBuilder();
	for (int i = 0; i < 3; i++)
	{
		words[i] = sc.next();
		
	}
	int smallest = Integer.MAX_VALUE;
	for(int i = 0; i < 3; i++)
	{
		if (smallest > words[i].length())
		{
			smallest = words[i].length();			
		}
	}
	System.out.println("Output :"  ); 
		
	for( int j = 0; j < smallest; j++)
	{
		char first = words[0].charAt(j);
		if(first==words[1].charAt(j) && first ==words[2].charAt(j))
		{
			
			prefix.append(first);
		}
		else
		{
			break;
		}
		
	}
	System.out.println(prefix.toString());

	}
}
//faster method would be using a while loop. instead of 2 fors
