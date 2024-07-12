package com.logic;

public class ArmstrongNumber2 
{
	//to print 1-1000 armstrong number
		  public static void main(String[] args)
		  {
		    for (int i = 1; i <= 1000; i++)
		    {
		      int num = i;
		      int result = 0;

		    for (;num > 0;)
		      {
		        int remainder = num % 10;
		        result += remainder * remainder * remainder;
		        num /= 10;
		      }

		      if (result == i)
		      {
		        System.out.println(i + " = Armstrong Number");
		      }
		    }
		    
		  }
		  
   }
