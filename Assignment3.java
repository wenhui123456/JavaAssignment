package assignment;

import org.omg.CORBA.SystemException;

public class Assignment3 {

	public static void main(String[] args) {
		//Write code that returns i =2 element of array of integer. Try to return also element on position i=n, i=n-1
		int[] arr = {1, 3, 5, 7, 9, 11, 12, 13, 14, 20};
		System.out.println("Element in i = 2" + arr[2]);
		//array[n] will throw an ArrayIndexOutOfBoundsException
		//System.out.println("Element in i = n" + arr[arr.length]);
		System.out.println("Element in i = n-1" + arr[arr.length-1]);
		System.out.println("Element in i = n-2" + arr[arr.length-2]);
		
		int n = arr.length;
		System.out.println("n: " + n);
		//Write code that iterate through all elements in the array[n] of integer and print values, where n = 10. 
		for(int i = 0; i < n; i++) {
			System.out.printf("Element in i = %d is %d.\n", i, arr[i]);
		}
		
		//Write program that counts how many times the letter 's' occurs in Mississippi
		String str = "Mississippi";
		int cnt = countS(str);
		System.out.println("letter 's' occurs " + cnt + " times.");
		
		
		//Find result of sum f(i) = (1 + i)*2 where  i = 0...n, n =5. 
		int sum = sumF(5);
		System.out.println("Result of sum f(i): " + sum);
		
		//Write a program to find a given string is Palindrome or not. 
		str = "abba";
		System.out.println(str + "is Palindrome? " + isPalindrome(str));
		
		//Given array of integers arr[1,4,0,-3,7] (values of elements could vary), 
		//determine whether the sum of its elements is odd or even. Give your answer as a string 
		//matching "odd" or "even". For example:  input [0,-2,7], [1,1,3,3] output ¡°odd¡±, ¡°even¡±.
		int[] nums = {1,4,0,-3,7};
		System.out.println("Sum of the array's elements is "+oddOrEven(nums));
		
	}
	
	//Program that counts how many times the letter 's' occurs in Mississippi
	public static int countS(String str) {
		int cnt = 0;
		for(char c : str.toCharArray()) {
			if(c == 's') {
				cnt++;
			}
		}
		return cnt;
	}
	
	//Find result of sum f(i) = (1 + i)*2 where  i = 0...n, n =5.
	public static int sumF(int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += (1 + i) * 2;
		}
		return sum;
	}
	
	//Write a program to find a given string is Palindrome or not.
	public static boolean isPalindrome(String str) {
		int first = 0, last = str.length()-1;
		while(first < last) {
			if(str.charAt(first++) != str.charAt(last--)) {
				return false;
			}
		}
		return true;
	}
	
	//sum of array's elements is odd or even?
	private static String oddOrEven(int[] nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return (sum % 2) == 0? "even":"odd";
	}

}
