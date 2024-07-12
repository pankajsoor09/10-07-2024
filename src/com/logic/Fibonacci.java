package com.logic;

public class Fibonacci
{
	//fibonacci series 1 + 4 = 5 , 5+4 = 9, 9+5 =14 --> 1,4,5,9,14,23,37,60..... 
	 public static void main(String[] args)
	{
	   int num1=1 ,num2=4;
	   System.out.println(num1+" "+num2);
	   int result = 0;

	for(int i=0;i<11;i++)
	{
	 result = num1 + num2;
	System.out.println(" "+result);
	num1 = num2;
	num2 = result;
	}

	 }

	}
	 

