package corejavafundamental;

public class RobustPalindromeCheck {

	public static void main(String[] args) {
		
		
	}
	
	static boolean robustPalindromeCheck(String str) {
		
//		String str= Character.isJavaLetterOrDigit(str);
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
