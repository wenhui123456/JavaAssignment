package assignment;


public class Assignment4 {
	
	public class Preson{
		
	}
	public static void main(String[] args) {
		// 1) Write a code determine the total number of digits in the integer (n>=0) given as input to the function.
		//For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. 
		int n = 1000;
		System.out.println("Total number of digits in "+ n + " is "+ countDigit(n));
		
		// 2) You will be given an array and a limit value. You must check that all values in the array are 
		//below or equal to the limit value. If they are, return true. Else, return false. 
		int[] nums = {1,3,4,5,7,10,9};
		int limit = 10;
		System.out.println("all values in the array are below or equal to "+ limit + " ? "+ checkAll(nums, limit));

	}
	// 1) Count number of digits of a integer
	public static int countDigit(int n) {
		if(n==0) return 1;
		int cnt = 0;
		while(n > 0) {
			n /= 10;
			cnt++;
		}
		return cnt;
	}
	
	
	// 2) Check all values in array are below or equal to the limit value
	public static boolean checkAll(int[] nums, int limit) {
		for(int num : nums) {
			if(num > limit) {
				return false;
			}
		}
		return true;
	}

}

