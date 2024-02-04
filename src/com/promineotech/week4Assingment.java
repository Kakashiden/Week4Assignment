package com.promineotech;

import java.lang.reflect.Array;

public class week4Assingment
{
	
	public static void main(String[] args) 
	{
System.out.println("Problem 1");
int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //create an array of int ages containing 8 elements.
	
	System.out.println( ages[ages.length - 1] - ages[0]); // Print last element in ages - first element of ages.
	
int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 98}; //create an array of int ages2 containing 9 elements.

	System.out.println( ages2[ages2.length - 1] - ages2[0]); // Print last element in ages - first element of ages.
	// index values for the elements is dynamic (works for arrays of different lengths).
	
int sum = 0; // create int to hold sum of all elements in array ages2

	for (int i = 0; i < ages2.length; i++) { //Loop to iterate through each element of array ages2
		
		sum += ages2[i]; //set sum equal to sum plus element at ages2 index i
		}
	double averageAge = sum / ages2.length; //create double to hold average of all elements in array ages2
	
	System.out.println(averageAge); //Print averageAge of array ages2
	
//-------------------------------------------------------------------------------------------------------------	
	System.out.println(); // creat space between outputs of problem 1 and 2
	System.out.println("Problem 2"); // identify begining of output for problem 2
	
String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //Create string names
int sumLetters = 0; // store the sum of letters in the array names
	for (int i = 0; i < names.length; i++) { ///Loop to iterate through each element of array names
		sumLetters += names[i].length(); //set sumLetters equal to sumLetters plus length of element at names index i
	}
	
int averageLetters =  sumLetters / names.length; // store the value of the average letters per name
System.out.println(averageLetters); // print out average letters per name.
String names2 = "";
	for (int i = 0; i < names.length; i++) { ///Loop to iterate through each element of array names
		
		names2 += names[i] + " "; // concatenate the names in array names with a space between them to names2.
			}
	System.out.println(names2); // print out names2.
//------------------------------------------------------------------------------------------------------------
//Problem 3
	System.out.println(); //Create space betwen problem 2 and 3
	System.out.println("Problem 3: " + "How do you access the last element of any array?");//print in console begining of problem 3
	
	System.out.println("To access the last element of an array you could use the code: arrayName[arrayName.length - 1]"); // answer
//------------------------------------------------------------------------------------------------------------	
// Problem 4 	
	System.out.println(); //Create space betwen problem 3 and 4
	System.out.println("Problem 4: How do you access the first element of any array?");//print in console begining of problem 4
	System.out.println("To access the 1st element in any array use arrayName[0]");// answer
//------------------------------------------------------------------------------------------------------------	
// Problem 5 no output
	System.out.println(); //Create space between problem 4 and 5/6

	int[] nameLengths = new int[names.length]; // Create array nameLengths set size equal to array names
		for (int i = 0; i < names.length; i++) { ///Loop to iterate through each element of array names
		
		nameLengths[i] = names[i].length(); // set naeLengths array index equal to names array index
		//System.out.println(nameLengths[i]); // print nameLengths index to test
		}
		
//------------------------------------------------------------------------------------------------------------	
// Problem 6 no output	
	
	int sumNameLength = 0; // initialize and set int sumNameLength equal to 0
		for ( int i = 0; i < nameLengths.length; i++) { // loop while index is less than nameLength
		sumNameLength += nameLengths[i]; // set sumNameLength equal it index of nameLength
	}
		System.out.print("Problem 6: "); //Print Problem 6: 
		System.out.println(sumNameLength);//Print sumNameLengths
		
		System.out.println(); //Create space between problem 6 and 7 
		System.out.print("Problem 7: "); //Print Problem 7:
		String word = "Potato"; //initialize string word set to Potato for Problem 7
		int n = 3; // initialize int n set to 3 for Problem 7
		System.out.println(wordConcat(word,n)); // print and call method wordConcat for Problem 7
		
		System.out.println(); //Create space between problem 7 and 8 
		System.out.print("Problem 8: "); //Print Problem 8:
		String firstName = "Bryan"; // Initialize String firstName set equal to Bryan for Problem 8
		String lastName = "Hiner"; // Initialize String lastName set equal to Hiner for Problem 8
		System.out.println(nameConcat(firstName,lastName)); // print result of nameConcat method for Problem 8
		
		System.out.println(); //Create space between problem 8 and 9
		System.out.print("Problem 9: "); //Print Problem 9:
		int[] sumNum = {10,12,13,14,15,17,18,19,30,38}; // Declare and fill an array of int to pass into sumArray method
		System.out.println("The sum of the array is greater than 100?: " + sumArray(sumNum)); // Print the sum of the array for problem 9 to screen
		
		System.out.println(); //Create space between problem 9 and 10
		System.out.print("Problem 10: "); //Print Problem 10:
		double[] sumNumDouble = {10.12,13.14,15.17,18.19,30.38}; // Declare and fill an array of double to pass into sumArrayDouble method
		System.out.println("The average of the array sumNumDouble is: " + averageArrayDouble(sumNumDouble)); // Print the average of the array for problem 10 to screen
		
		
		System.out.println(); //Create space between problem 10 and 11
		System.out.print("Problem 11: "); //Print Problem 11:
		double[] doubleOne = {10.12,13.14,15.17,18.19,30.38}; // Declare and fill an array of double to pass into arrayDouble method
		double[] doubleTwo = {10.12,13.14,15.17,18.19}; // Declare and fill an array of double to pass into arrayDouble method
		System.out.println("The average of the array doubleOne is greater than the average of array doubleTwo: " + arrayDouble(doubleOne, doubleTwo)); // Print the average of the array for problem 11 to screen
		
		
		System.out.println(); //Create space between problem 11 and 12
		System.out.print("Problem 12: "); //Print Problem 12:
		boolean isHotOutside = true;
		double moneyInPocket = 11.57;
		System.out.println("I will buy a drink: " + willBuyDrink(isHotOutside,moneyInPocket));
		
		System.out.println(); //Create space between problem 12 and 13
		System.out.print("Problem 13: "); //Print Problem 13:
		double principle = 27583.00;
		double rate = 0.034;
		int months = 72;
		System.out.println("You took out a loan for a new car for the price of $27583.00");
		System.out.println("Your interest rate is 3.4%");
		System.out.println("You must have the loan paid in full in 6 years or 72 months");
		System.out.println("Your monthly payment needs to be: $" + monthlyPayment(principle,rate, months));
		
		
	}		
		
	
//-------------------------------------------------------------------------------------------------------------
//Problem 7
	
	
static String wordConcat(String word, int n) // method declaration, modifier, return type, name, parameters
{ 
	
	String wordConcatenated = word.repeat(n); //string variable set to equal a method repeat n times.
	
		return wordConcatenated; // return concatenated string.
		
}

//-------------------------------------------------------------------------------------------------------------
//Problem 8


public static String nameConcat(String firstName,String lastName) { // Create method to take in and concatenate two strings
	
	String fullName = firstName + " " + lastName; //Declare new string of fullName to hold the firstName plus lastName
	
		return fullName; // return fullName
}
//-------------------------------------------------------------------------------------------------------------
// Problem 9
 
public static boolean sumArray(int[] sumNum) { // Declare the boolean method to take in an array
	int sumArray = 0; // instantiate int to hold the sum of the array
	for(int i = 0; i < sumNum.length; i++) { // For loop to iterate over each element in the array
	sumArray = sumArray + sumNum[i]; // add each element to the total sumArray
	}
	if (sumArray > 100) { // if sum array is greater than 100
		return true; // return true
	}
	else { // if 100 or less
	return false; // return false 
}
}

//-------------------------------------------------------------------------------------------------------------
//Problem 10

public static double averageArrayDouble(double[] sumNumDouble) { // Declare the double method to take in an array of double
	double sumArrayDouble = 0; // instantiate double to hold the sum of the array
	for(int i = 0; i < sumNumDouble.length; i++) { // For loop to iterate over each element in the array
	sumArrayDouble = sumArrayDouble + sumNumDouble[i]; // add each element to the total sumArrayDouble
	}
	double arrayAverage = sumArrayDouble / sumNumDouble.length; // get the average of the array
	return arrayAverage; // return the double average
}

//-------------------------------------------------------------------------------------------------------------
//Problem 11

public static boolean arrayDouble(double[] doubleOne, double[] doubleTwo) { // Declare the boolean method to take in two arrays of double
	double sumDoubleOne = 0; // instantiate double to hold the sum of array doubleOne
	for(int i = 0; i < doubleOne.length; i++) { // For loop to iterate over each element in the array doubleOne
	sumDoubleOne = sumDoubleOne + doubleOne[i]; // add each element to the total sumDoubleOne
	}
	double arrayOneAverage = sumDoubleOne / doubleOne.length; //get average of doubleOne
	
	double sumDoubleTwo = 0; // instantiate double to hold the sum of array doubleTwo
	for(int i = 0; i < doubleTwo.length; i++) { // For loop to iterate over each element in the array doubleTwo
	sumDoubleTwo = sumDoubleTwo + doubleTwo[i]; // add each element to the total sumDoubleTwo
	}
	double arrayTwoAverage = sumDoubleTwo / doubleTwo.length; //get average of doubleTwo
	
	if (arrayOneAverage > arrayTwoAverage) { // compare arrayOneAverage to arrayTwoAverage
		return true; //return true
	}
	
	else { // if not true
		return false; // return false
	}
}

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // Method to output boolean after comparing isHotOutside and moneyInPocket
	
	if(isHotOutside && (moneyInPocket > 10.50)) { // test to see if condition is true
		return true;	//if true return true
	}
	
	else { // if false
		return false; //return false
	}
}
//I made this because I work inbanking and constantly need to use this formula. Amortiztion would also be handy.
public static double monthlyPayment(double principle, double rate, int months){ // Method to take in a double principle, double rate, and int months and out put Monthly payment
	double payment = (((rate/12) * principle) / (1 - (Math.pow(1 + (rate/12), -months)))); //Calculate Monthly payment
	return payment; // returns the payment
}


}
