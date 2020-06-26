package com.epam.Java8lambdas;

import java.util.ArrayList;
import java.util.List;

public class ListofPalindromes {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();  
		     list.add("madam");  
		     list.add("mam");  
		     list.add("Teacher");  
		     list.add("sos"); 
		     list.add("pop");
		     list.add("top");
		     list.add("level");
		     list.add("hello");
		     list.add("radar");
		     list.add("world");
		     list.add("apple");
		     list.add("java");
		     list.add("python");
		     System.out.println("A method that returns a list of all the palindrome strings:");
		     
		     List<String> palindrome_list = ListofPalindromes.print_strings_which_are_palindrome(list); 
		    
		     for(String str:palindrome_list)  
		    	    System.out.println(str);  
		    		    
	}
 public static List<String> print_strings_which_are_palindrome(List<String> list)
{
	List<String> palindromelist = new ArrayList<String>(); 
	  
	  for(String str: list)
	  {
		  String reverse="";
		 int length=str.length();
		  for ( int i = length - 1; i >= 0; i-- )  
		  {    reverse = reverse + str.charAt(i);  
		     }
		  if(str.equals(reverse))
		  { 
			  palindromelist.add(str);
		  }
		  else
			  continue;
	  }
	
	return palindromelist;
	  
}

}