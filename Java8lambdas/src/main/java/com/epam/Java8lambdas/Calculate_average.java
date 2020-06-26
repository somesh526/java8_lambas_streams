package com.epam.Java8lambdas;


import java.util.ArrayList;
public class Calculate_average {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculate_average object= new Calculate_average();
			 ArrayList<Integer> numbers = new ArrayList<Integer>();
		      numbers.add(2);
		      numbers.add(4);
		      numbers.add(8);
		      numbers.add(6);
		      int total=0;
	             for(int values: numbers)
	             { 
	            	 total+=values;
	            	 
	             }
	             int n= numbers.size();
	             double average=object.AverageofListofIntegers(total,n);
	             System.out.println("Average of the list of numbers:"+average);
	             
		}
		double AverageofListofIntegers(int total,int n)
		{
			double average=(double)total/(double)n;
			return average;
		}

	}