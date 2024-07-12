package com.logic;

public class SumOfNaturalNumber
{

	public static void main(String[] args) 
	{
     int num = 12;
     int sum = 0;
     
     if(num>0)
     {
    	 for(int i=1;i<=12;i++)
    	 {
    		 sum =sum + i;
    	 }
    	 System.out.println("Sum of First 11 Natural number is = "+sum);
     }
	}

}
