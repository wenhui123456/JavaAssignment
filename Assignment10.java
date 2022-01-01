package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		//1) How to change the standard message to a customized message by handling the Exception? 
		try {
			int myArray[] = new int[7];
			System.out.println(myArray[9]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds, it should be less then 7.");
		}
		
		// 2) Handling an exception that users enter letters in a field instead of numbers.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		try {
			double d = scan.nextDouble();
			System.out.println("Input is: "+d);
		}catch (InputMismatchException e) {
			System.out.println("Enter is not a number! "+ e);
		}
	}
}
