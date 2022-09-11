/**
   A class that instantiates a stack and checks if a string user types is a palindrome or not
	
   @author Greg Gutierrez
   @CS215
*/

import java.util.*;//will need scanner and stack... all of which are in util package

public class PalindromeStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("please enter a string:");
	Scanner scn=new Scanner(System.in);//scan input from user
	String userInput= scn.nextLine();
	Stack palStack= new Stack();//instantiating new stack
	String reverse="";//declaring reverse string variable
		
	//iterates through loop pushing characters to stack
	for(int i=0;i<userInput.length();i++) {
		palStack.push(userInput.charAt(i));
		
			
			}//end for loop	

		for(int i=0;!palStack.empty();i++) {
		
			reverse=reverse+palStack.pop();

		}//end for loop
	
		//compares reverse stack with initial stack, if the stacks are the 
		
		if(userInput.equals(reverse)) {
			System.out.println("This string is a Palindrome");
		}//end if 
		else
		{
			System.out.println("This is not a Palindrome");
		}//end else
		
		
	}//end main

}//end class