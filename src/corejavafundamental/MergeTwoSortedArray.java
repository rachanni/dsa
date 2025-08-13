package corejavafundamental;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
//		int []arr1= {3, 5, 6, 12, 15};
//		int []arr2= {9, 91, 101};
//		
//		int[] arr1 = {1, 4, 5, 8};
//		int[] arr2 = {2, 4, 6, 8};
//		
//		int[] arr1 = {};
//		int[] arr2 = {10, 20, 30};
		
		int[] arr1 = {-5, -3, 0, 2};
		int[] arr2 = {-10, -1, 1, 5};
		
		
//		int[] arr1 = {};
//		int[] arr2 = {};
		System.out.println(Arrays.toString(mergeTwoSortedArray(arr1, arr2)));
		System.out.println(Arrays.toString(mergeTwoSortedArrayWithoutCopying(arr1, arr2)));
		
	}
	
	public static int []  mergeTwoSortedArray(int []arr1, int []arr2) {
		
		int length1= arr1.length;
		int length2 = arr2.length;
		
//		declare array of length sufficient to hold both array element 
		int [] arr= new int[length1+length2];
		
//		first copy each element from arr1 to arr
		for(int i= 0; i< length1; i++) {
			
			arr[i]= arr1[i];
		}
		
//		then copy all element from arr2 to arr
//		debug this part
//		for(int i=length1; i<length1+length2; i++) {
//			for(int x: arr2) {
//				arr[i]=x;
//			}
//		}
		
//		copy element from arr2 to arr
		for(int i=0; i< length2; i++) {
			arr[i+length1]=arr2[i];
		}
//		
//		picking one element and comparing with next element till end
		for(int i=0; i< arr.length; i++) {
			int element = arr[i];
			
			for(int j=i+1; j<arr.length; j++) {
				
//				if found element greater than current element than swapping position
				if(element>=arr[j]) {
					int temp= element;
					arr[i]= arr[j];
					arr[j]= temp;
//					initially i missed to update element 
//					please debug after commenting it
					element=arr[i];
				}
			}
		}
		return arr;
	}
	
	
	public static int [] mergeTwoSortedArrayWithoutCopying(int []arr1, int []arr2) {
	
		int length1= arr1.length;
		int length2= arr2.length;
		
//		merged array size length is equal to size of sum of individual array
		int []mergedArray= new int[length1+length2];
		
//		current position in arr1
		int index1=0;
//		current position in arr2
		int index2=0;
//		current index in mergedArray
		int mergedIndex=0;
		
//		intentionally we are breaking loop when traverse any one loop till end
//		surely larger array few elements will be left to be copied in mergedArray
//		we will handle left element separately
		
		
		while(index1<length1 && index2<length2) {
			
			if(arr1[index1]<=arr2[index2]) {
				mergedArray[mergedIndex]=arr1[index1];
				index1++;
				mergedIndex++;
			}else {
				mergedArray[mergedIndex]=arr2[index2];
				index2++;
				mergedIndex++;
			}
		}
		
//		this condition will be true only if we have not traversed arr1 till end
//		copy remaining element 
		while(index1<length1) {
			
			mergedArray[mergedIndex]=arr1[index1];
			index1++;
			mergedIndex++;
		}
		
		while(index2<length2) {
			
			mergedArray[mergedIndex]= arr2[index2];
			index2++;
			mergedIndex++;
		}
		return mergedArray;
	}
}
