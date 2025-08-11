package corejavafundamental;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "abcdef";
		System.out.println(str);
		System.out.println(reverseString(str));
		System.out.println(reverseStringUsingStringBuilder(str));
		System.out.println(reverseStringUsingCharArray(str));
		
	}
	
//	reverse a string
//	inefficient b/c time complexity is O(n^2)
//	string immutability is causing problem
	public static String reverseString(String str) {
		
		String emptyString = "";
		int length=str.length();
		for(int i=length-1; i>=0; i--) {
			emptyString= emptyString+ str.charAt(i);
		}
		return emptyString;
	}
	
//	use StringBuilder
	
public static String reverseStringUsingStringBuilder(String str) {
		
		StringBuilder stringBuilder= new StringBuilder();
		int length=str.length();
		for(int i=length-1; i>=0; i--) {
			
//			below line is not apllicale in case of SB
//			stringBuilder= stringBuilder+str.charAt(i);
			
//			stringBuilder=stringBuilder.append(str.charAt(i));
			
			 stringBuilder.append(str.charAt(i)); // no reassignment needed
		}
		return stringBuilder.toString();
	}

//using char[] array

	public static String reverseStringUsingCharArray(String str) {
		
		int length= str.length();
		char [] arr= new char[length];
		int temp= 0;
		for(int i=length-1; i>=0; i--) {
			
			arr[temp]=str.charAt(i);
			temp++;
		}
//		return arr.toString();
		return new String(arr);
	}
}
