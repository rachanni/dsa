package corejavafundamental;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		String str="abba";
		System.out.println(checkPalindrom(str));
		System.out.println(checkPalindromCaseInsensitive(str));
		
	}
	
//	this work fine for case sensitive 
//	Bob -> false b/c B != b
//	how to make it case insensitive
	static boolean checkPalindrom(String str) {
		
		int length= str.length();
		int j= length-1;
		for(int i=0; i<length; i++) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}
	
	
//  In ASCII, lowercase letters have higher ASCII values than their uppercase counterparts.
//	The difference between the ASCII value of an uppercase letter and its corresponding lowercase
//	letter is consistently 32. 
	
//	our requirement is B == b -> true
//	Approach -> change the original string to either upper case or lower case before comparison
//	Time complexity -> O(n) 
//static boolean checkPalindromCaseInsensitive(String str) {
//		
//		int length= str.length();
//		String changeToUpperCase= str.toUpperCase();
//		int j= length-1;
//		for(int i=0; i<length; i++) { 
//			if(changeToUpperCase.charAt(i)!=changeToUpperCase.charAt(j)) {
//				return false;
//			}
//			j--;
//		}
//		return true;
//	}

//	time complexity -> O(n/2) or simply O(n)
//	only need to traverse half of the string
static boolean checkPalindromCaseInsensitive(String str) {
	
	int length= str.length();
	String changeToUpperCase= str.toUpperCase();
	int j= length-1;
	for(int i=0; i<j; i++) { 
		if(changeToUpperCase.charAt(i)!=changeToUpperCase.charAt(j)) {
			return false;
		}
		j--;
	}
	return true;
}
}
