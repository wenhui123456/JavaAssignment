package assignment;

public class Assignment5 {
	public static void main(String[] args) {
		// 1) Reverse a string using recursion 
		String str = "abcdefg";
		System.out.println("Reverse "+ str + " to " + reverseStr(str, 0));
	
		// 2) Efficiently implement power function 
		System.out.println("Quick power: "+ quickPow(2, 11));
		
		/* 3) What does the following program do?
		 * someMethod() required 3 argument, inside formar(), only two argument in someMethod. 
		 * It will be an error. If correct that part it can return concatenation of int array from n to x.
		 * E.g. int[] arr =  {1,2,3,4}; someMethod(arr, 0, ¡°¡±); output: 4321; 
		 */

	}
	// 1)
	public static String reverseStr(String str, int i) {
		if(i >= str.length()) {
			return "";
		}else {
			return reverseStr(str, i+1)+str.charAt(i);
		}
	}
	
	//2)Efficiently implement power function 
	public static double quickPow(double x, int n) {
		long ln = (long)n;
		return n > 0? cPow(x, ln):1.0/cPow(x, ln);
		
	}
	public static double cPow(double x, long n) {
		if(n == 0) return 1.0;
		double y = cPow(x, n/2);
		return n%2==0? y*y : y*y*x;
		
	}
	
}
