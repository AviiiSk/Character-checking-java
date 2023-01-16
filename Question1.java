import java.util.*;

// 1. Design method to check whether the character is alphabet, digit and special symbol.


public class Question1 {

	
	public static void checking(int d)
	{
		if (d>=65 && d<=90) // use the ASCII value to check the enter value is Capital letter
		{
			System.out.println("you Enter the Capital Letter alphabet");
			
		}
		else if(d>=97 && d<=122) // use ASCII value to check the enter value is small alphabet
		{
			System.out.println("You Enter the Small Letter alphabet");
		}
		else if(d>=48 && d<=57) // Use ASCII value to check the enter value is Number
		{
			System.out.println("You Enter the Digit");
			
		}
		else if(d>=33 && d<=47 || d>=58 && d<=64 || d>=91 && d<=96 || d>=123 && d<=126)
		{
			System.out.println("You Enter the Special Character ");
			// use the ASCII value to check the enter value is Special Symbol
		}
		else {
			System.out.println("You Enter Wrong Input");
			
		}
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	
		Scanner sd = new Scanner(System.in); // creating the scanner class 
		
		
		System.out.println("Enter the Character or Value to be checked ");
		
		
		int d = sd.next().charAt(0);
		
		checking(d);  // calling method 

	}

}
