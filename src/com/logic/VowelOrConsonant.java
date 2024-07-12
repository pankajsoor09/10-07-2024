package com.logic;

public class VowelOrConsonant
	{
    public static void main(String[] args)
{
     char ch = 'P';
   if(ch == 'a' || ch=='e'|| ch=='i'|| ch =='o'|| ch=='u'||ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
    {
     System.out.println("It's a Vowel");
    }
     else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
   {
      System.out.println("It's a Consonant");
   }
    
}

}


