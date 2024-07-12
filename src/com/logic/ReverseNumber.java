package com.logic;

public class ReverseNumber 
{
	    public static void main(String[] args)
	    {
	         int number = 123 ;
	         int reverse = 0;
	           
	         for(;number>0;)
	         {
	           int remainder = number%10;
	           reverse = reverse * 10 + remainder;
	           number = number/10;
	         }
	         System.out.println("The reversed number is " + reverse);
	         /* number = 123
	          * remainder = 123 % 10 = 3
	          * reverse = 0 * 10 + 3 = 0 + 3 = 3
	          * number = 123 / 10 = 12
	          * ------------------------------------
	          * number = 12
	          * remainder = 12 % 10 = 2
	          * reverse = 3 * 10 + 2 = 30 + 2 = 32
	          * number = 12 / 10 = 1
	          * -------------------------------------
	          * number = 1
	          * remainder = 1 % 10 = 1
	          * reverse = 32 * 10 + 1 = 320 + 1 = 321
	          * number = 1 / 10 = 0
	          * for(;number>0;) here number became 0 . so now it will stop iteration.
	          */
	              
	    }
}
