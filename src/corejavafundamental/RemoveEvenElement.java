package corejavafundamental;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//array is given containing number, remove the odd number
public class RemoveEvenElement {

	public static void main(String[] args) {
		
		int []arr= {14, 78, 5, 9, 7, 10,11};
	}
	
//	i want to use arraylist and iterator concept
	public static int[] removeOdd(int []arr) {
		
		List list= Arrays.asList(arr);
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			
			int element= (int)itr.next();
			if(element!=0) {
				itr.remove();
			}
		}
		
		return null;
//		return list.toArray();
	}
}
