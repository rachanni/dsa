package corejavafundamental;

public class SecondLargestElementInArrayImproved {

	public static void main(String[] args) {
		
		int []arr= {5,7,3,8,51,12,10,71,70};
		System.out.println(findSecondLargest(arr));
		System.out.println(findSecondLargestImproved(arr));
	}
	
	public static int findSecondLargest(int [] arr) {

		int largest= Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
		}
		return secondLargest;
	}
	
	public static int findSecondLargestImproved(int[] arr) {
	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	    for (int num : arr) {
	        if (num > largest) {
	            secondLargest = largest;
	            largest = num;
	        } else if (num > secondLargest && num != largest) {
	            secondLargest = num;
	        }
	    }
	    return secondLargest;
	}

}
