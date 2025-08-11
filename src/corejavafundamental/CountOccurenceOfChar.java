package corejavafundamental;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		
		String str="aba";
		countEachChar(str);
		System.out.println("----------------");
		countEachCharAvoidRepeatCounting(str);
		System.out.println("----------------");
		charCountUsingMap(str);
		String projectBaseDir = System.getProperty("user.dir");
        System.out.println("Project Base Directory: " + projectBaseDir);
		
	}
	
//	count each character in given string
//	problem with this -> duplicate counting
//	You need a way to mark visited characters so you don't count them again.
//	one more problem is O(n^2)


	public static void countEachChar(String str) {
		for(int i=0; i< str.length(); i++) {
			char ch= str.charAt(i);
			int count =1;
			for(int j=i+1; j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch+":"+count);
		}
	}
	
//	revised approach without duplicate counting 
//	but still O(n^2)
	public static void countEachCharAvoidRepeatCounting(String str) {
		
//		declare a boolean array to mark visited char
		boolean[] visited= new boolean[str.length()];
		
		
		for(int i=0; i< str.length(); i++) {
			
			if(visited[i]) {
				continue; // skip current iteration -> b/c already counted this char
			}
			char ch= str.charAt(i);
			int count =1;
			for(int j=i+1; j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count++;
					visited[j]=true; // mark as counted
				}
			}
			System.out.println(ch+":"+count);
		}
	}
	
	
//	use Map for time complexity O(n)
	
	public static void charCountUsingMap(String str) {
		
		Map<Character, Integer> map= new HashMap<>();
		char[] ch= str.toCharArray();
		for(char c: ch) {
			
//			check if c is already in the map
			if(map.containsKey(c)) {
//				if yes, get the old value and increment
				int oldCount= map.get(c);
				map.put(c, oldCount+1);
				
			}else {
//				if not , start with count 1
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
