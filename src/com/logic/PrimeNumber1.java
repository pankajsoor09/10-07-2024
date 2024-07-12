package com.logic;

public class PrimeNumber1
{

	public static void main(String[] args)
	{
		
		       int number = 17;
		       int counter = 0;
		       
		       
		      for(int i =2;i<number;i++)
		         {
		           if(number%i==0)
		           {
		               counter++;
		             }

		          } 
		    
		 if(counter==0)
		 {
		     System.out.println(number+" is Prime Number");
		    }
		    else
		    {
		        System.out.println(number+" is not Prime Number"); 
		     }
	}
}
      
	


