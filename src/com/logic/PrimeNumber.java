package com.logic;

public class PrimeNumber 
{
	//print prime number from 1 to 1000
	   public static void main(String[] args)
	  { 
	     int count = 0;
	    for(int number=2;number<=1000;number++)
	{
	     int counter=0;
	     for(int i=2;i<number;i++){
	       if(number%i==0)
	        {
	           counter++;
	        }
	   }
	       if(counter==0){
	       System.out.println(number+" ");
	       count++;
	       }
	 }

	System.out.println("Total Number of primeNumber : "+count);
	}

	}