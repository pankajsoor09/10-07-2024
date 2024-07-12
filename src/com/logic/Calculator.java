package com.logic;

public class Calculator 
 {
    public static void main(String[] args)
  { 
    int num1 = 27, num2 = 9;
    char operator ='+';
    int result =0;

   switch(operator)
     {
            default : System.out.println("Invalid operator");
           break;
    case '+' :
           result = num1+num2;
         System.out.println("Additon of "+num1+" and "+num2+" is : "+result); 
            break;
        
    case '-' :
           result = num1-num2;
         System.out.println("Subtraction of "+num1+" and "+num2+" is : "+result); 
            break;

    case '*' :
           result = num1*num2;
         System.out.println("Multiplication of "+num1+" and "+num2+" is : "+result); 
            break;

    case '/' :
           result = num1/num2;
         System.out.println("Division of "+ num1+" and "+num2+" is : "+result); 

    }

 }

}
            


