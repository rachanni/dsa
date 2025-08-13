package corejavafundamental;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int []arr= {3,1,4,5};
		
		System.out.println(missingNumber(arr, 5));
	}
	
	
	public static int missingNumber(int [] arr, int n) {
		
		int sum=0;
		for(int x:arr) {
			sum=sum+x;
		}
		
		int requiredSum= ((n*n) +n)/2;
		return requiredSum-sum;
	}
}
