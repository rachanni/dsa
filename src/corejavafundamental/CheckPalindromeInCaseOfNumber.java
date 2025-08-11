package corejavafundamental;

public class CheckPalindromeInCaseOfNumber {

	public static void main(String[] args) {
		
		int num = 010;
		System.out.println(isPalindrome(num));
		System.out.println(efficientPalindromeCheck(num));
	}
	
////	checking Palindrome in case of number
//	static boolean isPalindrome(int num) {
//		
//
////		why converting primitive to object?
////		so that we can call toString() method
//		Integer inputNumber= num;
//		
////		convert number to String 
//		String str= inputNumber.toString();
//		
//		int length= str.length();
//		String changeToUpperCase= str.toUpperCase();
//		int j= length-1;
//		for(int i=0; i<j; i++) { 
//			if(changeToUpperCase.charAt(i)!=changeToUpperCase.charAt(j)) {
//				return false;
//			}
//			j--;
//		}
//		
//		return true;
//	}
//	
	
	
//	checking Palindrome in case of number
//	problem with this approach is we are reversing whole number then doing comparison
//	although for palindrome check, we can we can reverse half number only then can do comparison
//	1221 -> second half = 21 reverse it 12 then do comparison with first half
//	12321 -> second half = 21 reverse it 12 then do comparison with first half
	static boolean isPalindrome(int num) {
		

		int reversedNumber= reverseNumber(num);
		if(num!=reversedNumber) {
			return false;
		}
		

		return true;

	}
	
	static int reverseNumber(int number) {
		
//		initially reversed number is 0
		int reversedNumber=0;
		
		while(number!=0) {
			int remainder = number%10;
			number = number/10;
			reversedNumber=reversedNumber*10+ remainder;
		}
		
		return reversedNumber;
	}
	
static boolean efficientPalindromeCheck(int num) {
		
//	negatives or number ending with 0 but not 0 can't be palindrome
	
		if(num < 0 || (num%10 ==0 && num!=0 )) {
			return false;
		}

		int reversedHalf= 0;
		while(num>reversedHalf) {
			reversedHalf= reversedHalf*10 + num%10;
			num = num /10;
		}
	
		
//		for even digits : num == reversedHalf 
//		for odd digits  : num == reversedHalf / 10
		if(num == reversedHalf || num == reversedHalf/10) {
			return true;
		}
		return false;

	}
	
}
