package com.logic;

public class ArmstrongNumber1
{
	public static void main(String[] args) 
	{
	        int number = 153; // Given number
	        int digit1 = number / 100; // First digit
	        int digit2 = (number / 10) % 10; // Second digit
	        int digit3 = number % 10; // Third digit

	        int result = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);

	        if (result == number)
	        {
	            System.out.println(number + " is an Armstrong number.");
	        } else
	        {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}



