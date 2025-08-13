package corejavafundamental;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		
		int []arr= {5,7,2,5,3};
		
//		int[] arr = {5, 5, 5, 5};
//		int[] arr = {5, 7, 2, 5, 3, 2};
//		int[] arr = {1, 1, 2, 2, 3, 3};
//		int[] arr = {0, 1, 0, 2, 1};



		System.out.println("Input array:"+Arrays.toString(arr));
		
//		this will print an object hashcode 
//		System.out.println(removeDuplicate(arr));
//		use Arrays.toString() -> human-readable string representation of the contents of an array.
//		System.out.println(Arrays.toString(removeDuplicate(arr)));
		System.out.println(Arrays.toString(removeDuplicateUsingSet(arr)));
	

	}
	

//	problem with this approach is 1. O(n^2)  2. we are replacing duplicate with zero 
	public static int[] removeDuplicate(int []arr) {
		
		int length=arr.length;
		
		for(int i=0; i<length; i++) {
			
			for(int j=i+1; j<length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
			
		}
		return arr;
	}
	
//	use Set 
	
	public static int[] removeDuplicateUsingSet(int [] arr) {
		
		Set<Integer> set= new HashSet<>();
		for(int x: arr) {
			set.add(x);
		}
		
//		convert set back to int[]
		
		int[] uniqueElementArray= new int[set.size()];
		int i=0;
		for(int x: set) {
			uniqueElementArray[i]=x;
			i++;
		}
		return uniqueElementArray;
	}
}
