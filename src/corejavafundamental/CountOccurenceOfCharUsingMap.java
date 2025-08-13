package corejavafundamental;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfCharUsingMap {

	public static void main(String[] args) {
		
		String str = "LAPATA";
		System.out.println(charCountInString(str));
		
//		print character and their count line by line
//		little bit improvement -> no need to create new empty map
//		initialize map with key- value pair returned by method
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		Map<Character, Integer> map = charCountInString(str);
		
		map.forEach((c, count)->System.out.println("count of "+c+":"+count));
		
	}
	
	public static Map<Character, Integer> charCountInString(String str) {
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
//		storing char int char[]
//		why? so that we fetch each char one by one
		char [] ch= str.toCharArray();
		
		for(char c: ch) {
			
//			if char is present in map then fetch old value and increment by 1
//			else storing that char first time in map and its value will be 1
			if(map.containsKey(c)) {
				int temp=map.get(c)+1;
				map.put(c, temp);
			}else {
				map.put(c, 1);
			}
		}
		return map;
	}
}
