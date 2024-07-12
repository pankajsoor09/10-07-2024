package com.logic;

public class PalindromeNumber
{
	 public static void main(String[] args)
	{
       int number = 131 ;
	   int originalNumber = number;
	   int reverse = 0;
			           
		while (originalNumber>0)
	     {
           int remainder = originalNumber%10;  // same as in reverse number
		   reverse = reverse * 10 + remainder;
		   originalNumber = originalNumber/10;
	     }
		 
		   if(number == reverse)
		   {
		     System.out.println("The number " + number + " is a palindrome");
		   }
		     else
		   {
		     System.out.println("The number " + number + " is not a palindrome");
		   }
	    

    }

}	
			        

