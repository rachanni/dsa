package corejavafundamental;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		int []arr= {3,1,7,6};
		System.out.println(secondLargest(arr));
	}
	
	static int secondLargest(int [] arr) {
		
		if(arr==null || arr.length<2) {
			throw new IllegalArgumentException("Array must contain at least two element");
			
		}
		
		Integer largest= null;
		Integer second= null;
		
		for(int x:arr) {
//			here short circuit evaluation take place
			if(largest == null || x> largest) {
				second =largest;
				largest = x;
			}else if(x!= largest && (second == null || x> second)) {
				second =x;
			}
		}
		if(second == null) {
			
			throw new IllegalArgumentException("No second largest element (array may have elements equal).");
			
		}
		return second;
	}
}
