package corejavafundamental;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		
		int num = 7811;
		System.out.println(sumOfDigit(num));
		System.out.println(sumOfDigitUsingRecursion(num));
	}
	
	public static int sumOfDigit(int num) {
		
		int sum=0;
		while(num != 0) {
			sum = sum + num % 10;
			num=num / 10;
		}
		return sum;
	}
	
	public static int sumOfDigitUsingRecursion(int num) {
		
		if(num ==0) {
			return 0;
		}
		
		return num % 10 + sumOfDigitUsingRecursion(num/10);
	}
}
