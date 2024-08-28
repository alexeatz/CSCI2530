package week2;
import java.util.Scanner;

public class FindWord {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String word = keyboard.nextLine();
		String sentence = keyboard.nextLine();
		System.out.println("The word is: " + word);
		System.out.println("The sentence is: " + sentence);
		if(sentence.contains(word))
		{
			System.out.print("The sentence does contain ");
		}
		else 
		{
			System.out.print("The sentence does not contain ");	
		}
		
		System.out.println(word + ".");
		
		//scanner.findAll(Pattern.compile(patString));

	}
}
