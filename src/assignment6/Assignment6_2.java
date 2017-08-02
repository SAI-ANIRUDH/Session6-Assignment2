package assignment6;// package is compulsory.
/*
 * Program to show negative age exception.
 */
import java.util.Scanner; // Importing Scanner class to take user defined age value

public class Assignment6_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int  age; // declaring the variable age
Scanner s=new Scanner(System.in); // Using the scanner class to take the input from User.
age=s.nextInt();
try { //Using Try block to show where the exception can occurs. 
	if (age<0)  // Taking the condition of age as per the assignment. 
		throw new NegativeAgeException("Age can't be less than zero"); // Using the throw statement to throw an exception when age is given negative value.
		else 
		System.out.println("Valid Age");}
catch (NegativeAgeException a) { // Using Catch block to use the Exception class
	System.out.println(a);
}
}
	
}
class NegativeAgeException extends Exception{ // Creating the exception class and defining it.
public  NegativeAgeException(String str) {
	System.out.println(str);
}
}