package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment9 {
	public static void main(String[] args) {
		// 1) Write a program to test a hash set is empty or not. 
		Set<Integer> set = new HashSet<>();
		System.out.println("Set is empty?" + set.isEmpty());
		set.add(1);
		System.out.println("Set is empty?" + set.isEmpty());
		
		// 2) Write a program to append the specified element to the end of a hash set. 
		set.add(3);
		
		// 3) Write a program to convert a hash set to a List/ArrayList. 
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list.toString());
		
		// 3) Write a program to remove all of the elements from a list. 
		list.clear();
		System.out.println(list.toString());
		
		// 5) Given array of integers as parameter return a list of negative numbers.  
		int[] nums = {1,2,4,64,36,-4,-5,-13,7,6,8};
		System.out.println(toNegative(nums).toString());

	}
	//5) Given array of integers as parameter return a list of negative numbers.
	public static List<Integer> toNegative(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int num : nums) {
			if(num > 0) {
				num = -num;
			}
			list.add(num);
		}
		return list;
	}
}
