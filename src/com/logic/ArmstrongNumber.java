package com.logic;

public class ArmstrongNumber {
	
	   public static void main(String[] args)
	    {

	       int num = 371;
	       int originalnum = num;
	       int result = 0;
	   while(originalnum > 0)
	   {
		   int reminder = originalnum%10;
		   result = result + (reminder * reminder * reminder);
		    originalnum = originalnum/10;
	   }
		   
	   if(result==num)
	   {
	    System.out.println(num +"= Armstrong Number");
	    }
	     else
	    {
	       System.out.println(num +"= Not Armstrong Number");
	    }

	  }

	}


