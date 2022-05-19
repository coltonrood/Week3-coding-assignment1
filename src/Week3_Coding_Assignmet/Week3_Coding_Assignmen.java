package Week3_Coding_Assignmet;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Week3_Coding_Assignmen {

	public static void main(String[] args) {
//		 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array
//          (i.e. do not use ages[7] in your code). Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.


		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
			int lengthOfArray = ages.length;
				int difference = Math.abs(ages[lengthOfArray - lengthOfArray] - ages[lengthOfArray - 1]);
					System.out.println(difference);
		
				// New array
		int[] newAges = new int[ages.length];
		
		       // Copy of original array to new array      
		System.arraycopy(ages, 0, newAges, 0, ages.length);
		
		// Subtracting first value from the last
		lengthOfArray = newAges.length;
			newAges[lengthOfArray - 1] = 40;
				difference = Math.abs(newAges[lengthOfArray - lengthOfArray] - newAges[lengthOfArray - 1]);
		
				System.out.println(difference);
		
		// Math to find average
		int sum = 0;
		for (int i = 0; i < newAges.length; i++) {
			sum += newAges[i];}
		double average = sum / lengthOfArray;
			System.out.println(average);
		
		
		//////////////////////////////////////
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//		
//		3.	How do you access the last element of any array?
		// array[array.length - 1]);
//		
//		4.	How do you access the first element of any array?
        // array[0];
		/////////////////////////////////////
		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		sum = 0;
				for (int i = 0; i < names.length; i++) {
					sum += names[i].length();}
				
				int average2 = sum / names.length;
				
				System.out.println(average2);
				
				String allNames = "";
			
				for (int i = 0; i < names.length; i++) {
					allNames += names[i] + " ";}
				
				
		        ///////////////////////////////		
//				5.	Create a new array of int called nameLengths.
//				Write a loop to iterate over the previously created names
//				array and add the length of each name to the nameLengths array.	
//				///////////////////////////////
				
				int[] nameLengths = new int[names.length];
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length();} 
					
				//System.out.println(nameLengths[i]);}
					// checking my for loop
				
				///////////////////////
//				6.	Write a loop to iterate over the nameLengths array
//				and calculate the sum of all the elements in the array.
//				Print the result to the console.
				///////////////////////
				
				sum = 0;
				for (int i = 0; i < nameLengths.length; i++) {
					sum += nameLengths[i] + names[i].length();}
						System.out.println(sum);
				
				
		//7. Print test for Method	
		 System.out.println(multiplyString("Hello" , 3));
		
				
		 //8. Print test for Method
		 System.out.println(createFullName("Bob" , "Ross"));
		

		 //9.Print test for Method
	     System.out.println(isGreaterThan100(ages));
		
				
		//10. Double array to test method
				double[] grades = new double[5];
				grades[0] = 44.3;
				grades[1] = 75.6;
				grades[2] = 96.4;
				grades[3] = 76.9;
				grades[4] = 98.1;
		
		//10. Print test for method		
		 System.out.println(findAverage(grades));
				
				
		//11. Duplicated Double Array with grades[1] changed for test method
				double[] grades1 = new double[5];
				grades[0] = 44.3;
				grades[1] = 0;
				grades[2] = 96.4;
				grades[3] = 76.9;
				grades[4] = 98.1;
				
		//11. Print test for method		
		 System.out.println(isFirstArrayGreater(grades , grades1));
	
		//12. Boolean and Double values to test method
				boolean isHotOutside = true;
				double moneyInPocket = 10;
				
		//12. Print test for method		
				System.out.println(willBuyDrink(isHotOutside , moneyInPocket));
				
				//13. Print test for Method
					System.out.println(smallestNumber(ages));
	
					
					
					
}                  ////////METHODS/////////
	
	
	
	
	         ////////////////////////
//			7.	Write a method that takes a String, word,
//			and an int, n, as arguments and returns the word 
//			concatenated to itself n number of times. 
//			(i.e. if I pass in “Hello” and 3, I would expect
//			the method to return “HelloHelloHello”).
			///////////////////////////
			
	public static String multiplyString(String word, int n) {
					String result = "";
					for (int i = 0; i < n; i++) {
						result += word; } 
				return result;}
	

			////////////////////////////////
//			8.	Write a method that takes two Strings, 
//			firstName and lastName, and returns a full name (the full name 
//			should be the first and the last name as a String separated by a space).
			/////////////////////////////////
			
	public static String createFullName(String x, String y) {
				String fullName = x + " " + y;
				return fullName;}
			
	
			/////////////////////////////////
//			9.	Write a method that takes an array
//			of int and returns true if the sum of all
//			the ints in the array is greater than 100.
			/////////////////////////////////
	
	public static boolean isGreaterThan100(int[] array) {
	int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		if (sum > 100) {}
				return true;} 
					return false;}

	
	
			//////////////////////////////
			//10.	Write a method that takes
			//      an array of double and returns 
	        //      the average of all the elements in the array.
			////////////////////////////////
	
	public static double findAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;}


			/////////////////////////////
//			//11.	Write a method that takes two arrays of double 
//					and returns true if the average of the elements in 	
//					the first array is greater than the average of the elements 
//					in the second array.
			/////////////////////////////
	
	
	public static boolean isFirstArrayGreater(double[] x, double[] y) {
		return findAverage(x) > findAverage(y);}

	
	
			///////////////////////////
//			12.		Write a method called willBuyDrink 
//			 		that takes a boolean isHotOutside, and a double moneyInPocket, 
//			 		and returns true if it is hot outside and 
//			 		if moneyInPocket is greater than 10.50.
	        //////////////////////////
	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.5) {
			return true;
		} else {
			return false;}}
	
			///////////////////////////
//			13.			Create a method of your own that solves a problem.
//						In comments, write what the method does and why you created it.
			
			// This method will find the smallest number in a given array of int
	        // I created this so if you have a large data set you can identify outliers fast as this code can be flipped
	 		// to be the largest number.
	
	
			//////////////////////////
	public static int smallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;}}
		return smallest;}}

