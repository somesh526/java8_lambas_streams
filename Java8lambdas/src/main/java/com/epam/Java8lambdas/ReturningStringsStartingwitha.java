package com.epam.Java8lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturningStringsStartingwitha {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturningStringsStartingwitha object= new ReturningStringsStartingwitha();
	
		
		ArrayList<String> list=new ArrayList<String>();  
	     list.add("Hello");  
	     list.add("World");  
	     list.add("java");  
	     list.add("and"); 
	     list.add("air");
	     list.add("are");
	     list.add("App");
	     list.add("apple");
	     list.add("python");
	     list.add("ash");
	     
List<String> resultlist = object.print_strings_with_a(list); 
System.out.println("method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters:");  
for(String str:resultlist)  
    System.out.println(str);  
	     }
	
	
	  public List<String> print_strings_with_a(ArrayList<String> list)
	  {
		  Collections.sort(list);
		  List<String> newlist = new ArrayList<String>(); ;
		  for(String str: list)
		  {
			  if(str.startsWith("a") && str.length()==3)
			  {
				 newlist.add(str);
			  }
		  }
		
		return newlist;
		  
	  }

}
